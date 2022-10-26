
//This is the main program in the whole assigments as it contains allt he needed functions and imports every other class
//the program has 5 tasks, from 0 to 4, which need different classes to be solve]

package MyZoo;

import java.util.*;

import Animal.Animal;
import Animal.Carnivore.*;
import Animal.Herbivore.*;
import Animal.Omnivore.*;
import Home.*;
import Food.*;

public class MyZoo {

    List<FoodStorage> foodStorages;
    List<Home> homes;

    public MyZoo() {
        this.homes = new ArrayList<Home>();
        for (int i = 0; i < 10; i++) {
            this.homes.add(new Cage());
        }

        for (int i = 0; i < 5; i++) {
            this.homes.add(new Enclosure());
        }

        FoodStorage hayStorage = new FoodStorage("hay");
        FoodStorage cornStorage = new FoodStorage("corn");
        FoodStorage grainStorage = new FoodStorage("grain");
        FoodStorage carrotsStorage = new FoodStorage("carrots");
        FoodStorage chickenStorage = new FoodStorage("chicken");
        FoodStorage beefStorage = new FoodStorage("beef");

        this.foodStorages = new ArrayList<>(Arrays.asList(
                hayStorage,
                cornStorage,
                grainStorage,
                carrotsStorage,
                chickenStorage,
                beefStorage));

    }

    // creating an algorithm to get an animal of type t with a certain name
    public Animal getAnimal(int type, String name) {
        switch (type) {
            case 1:
                return new Lion(name);
            case 2:
                return new Tiger(name);
            case 3:
                return new Leopard(name);
            case 4:
                return new Zebra(name);
            case 5:
                return new Antelope(name);
            case 6:
                return new Giraffe(name);
            case 7:
                return new Bear(name);

            default:
                return null;
        }
    }

    // task 0 refers to ading an animal of a certain type and name to a home
    // if an animal with the same name is in the zoo than it reurns false, otherwise
    // it adds the animal and returns true
    // 0
    public boolean addAnimalWithTypeAndNameToHome(int type, String name, int homeIndex) {
        for (int i = 0; i < homes.size(); i++) {
            List<Animal> animals = homes.get(i).getAnimals();
            for (int j = 0; j < animals.size(); j++) {
                if (animals.get(j).getName() == name) {
                    return false;
                }
            }
        }

        Animal animal = getAnimal(type, name);
        if (animal == null)
            return false;
        return this.homes.get(homeIndex).addAnimal(animal);
    }

    // task 1 refers to moving an animal with a name from the current home to
    // another one
    // it searches the whole zoo until it dinds the needed animal, it removes the
    // animal from current home and it adds it to a new home
    // 1
    public boolean moveAnimalWithNameToOtherHome(String name, int homeIndex) {
        for (int i = 0; i < homes.size(); i++) {
            List<Animal> animals = homes.get(i).getAnimals();
            for (int j = 0; j < animals.size(); j++) {
                if (animals.get(j).getName() == name) {
                    Animal animal = homes.get(i).removeAnimal(name);
                    return homes.get(homeIndex).addAnimal(animal);
                }
            }
        }
        return false;
    }

    // task 2 refers to removing an animal all togheter from the zoo:
    // it searches all the houses until it finds the needed animal, by name, and it
    // remove it from the current home
    // 2
    public boolean removeAnimalWithNameFromZoo(String name) {
        for (int i = 0; i < homes.size(); i++) {
            List<Animal> animals = homes.get(i).getAnimals();
            for (int j = 0; j < animals.size(); j++) {
                if (animals.get(j).getName() == name) {
                    homes.get(i).removeAnimal(name);
                    return true;
                }
            }
        }
        return false;
    }

    // task 3 refers to buying a food in an imouted amount and of the needed type
    // 3
    public boolean buyFoodOfTypeTheAmount(int type, int amount) {
        return foodStorages.get(type).storeFood(amount);

    }

    // task 4 feed a house whith a type of food in a certain amount :
    // if there is not enough food it returns false
    // if the animals like the food and the food exists it returns true
    // otherwise it returns false
    // 4
    public boolean feedFoodWithTypeAndAmountAndHome(int type, int amount, int homeIndex) {
        FoodStorage foodStorage = this.foodStorages.get(type);
        if (!foodStorage.discardFood(amount))
            return false;
        List<Animal> animals = this.homes.get(homeIndex).getAnimals();
        for (int i = 0; i < animals.size(); i++) {
            List<Food> animalFood = animals.get(i).getFood();
            boolean exists = false;
            for (int j = 0; j < animalFood.size(); j++) {
                if (animalFood.get(j).getType() == foodStorage.getType()) {
                    exists = true;
                    break;
                }
                if (!exists)
                    return false;
            }

        }
        return true;

    }
}
