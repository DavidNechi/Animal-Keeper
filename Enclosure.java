
//creating the class enclosure which can only contain six animals

package Home;

import Animal.Animal;
import Animal.Carnivore.Carnivore;

public class Enclosure extends Home {

    // if an ecnlosure already contains six animals it returns false,
    // if an enclosure has a carnivore than other animal can not stay in the same
    // one,
    // else the method adds an animal and returns true

    public boolean addAnimal(Animal animal) {
        if (animals.size() > 6)
            return false;

        if (animals.size() == 1 && animals.get(0) instanceof Carnivore)
            return false;

        if (animals.size() > 0 && animal instanceof Carnivore)
            return false;

        animals.add(animal);
        return true;

    }

}
