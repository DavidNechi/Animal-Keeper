
//creating the Omnivore class which only contains bears, which eat carrots, beef and chicken 
//The class extends the class Animal beacuse sbears are first of all animals

package Animal.Omnivore;

import java.util.*;

import Animal.Animal;
import Food.Food;

public class Omnivore extends Animal {

    public Omnivore(String name) {
        super(name);
        Food carrots = new Food("carrots");
        Food chicken = new Food("chicken");
        Food beef = new Food("beef");
        this.food = new ArrayList<>(Arrays.asList(carrots, chicken, beef));

    }

}
