
//creating the class Cages in which only carnivor animals can stay only one at a time

public class Cage extends Home {

    // if the added animal is herbivore the method return false,
    // if a cage already has ine animal, it return false,
    // if the cage has already an omnivore in it, there can not be another
    // carnivore/
    // if neither of these conditons apply, the cage is filled with one animal and
    // returns true
    public boolean addAnimal(Animal animal) {
        if (animals.size() > 2)
            return false;
        if (animal instanceof Herbivore)
            return false;
        if (animals.size() == 1) {
            if (animals.get(0) instanceof Carnivore)
                return false;
            if (animal instanceof Carnivore)
                return false;
            if (animals.get(0) instanceof Omnivore && animal instanceof Carnivore)
                return false;
        }

        animals.add(animal);
        return true;
    }

}
