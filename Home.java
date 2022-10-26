
//The class Home is created to store and solve problems regarding the habitats of the animnals(cages and enclousres)
//as well as the rules that apply to it

package Home;

import java.util.*;
import Animal.Animal;

public abstract class Home {

    // protected means that the original list of animals is not destroyed even if we
    // use it in this class
    protected List<Animal> animals;

    public Home() {
        this.animals = new ArrayList<Animal>();
    }

    // abstract defines a function which we implements in a function from which we
    // extend it
    public abstract boolean addAnimal(Animal animal);

    // the algothm uses the Animal list to remove an animal with a certain name from
    // it
    public Animal removeAnimal(String name) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName() == name) {
                Animal animal = animals.remove(i);
                return animal;
            }
        }
        return null;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

}
