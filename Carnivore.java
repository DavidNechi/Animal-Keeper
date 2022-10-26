
//Here it is created the class of carnivore animals with all their common traits,
// such as food in our example

//The class carnivore extends the class animal because these animals are first of all animals

package Animal.Carnivore;

import Food.Food;
import java.util.*;

import java.util.Arrays;

import Animal.Animal;

public class Carnivore extends Animal {

    public Carnivore(String name) {
        // the function super tackles and activates the constructor from Animal.java
        super(name);

        // Initializing the food they eat
        Food chicken = new Food("chicken");
        Food beef = new Food("beef");
        this.food = new ArrayList<>(Arrays.asList(chicken, beef));
    }
}
