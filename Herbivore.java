
//Here it is created the class of herbivore animals with all their common traits,
// such as food in our example

//The class Herbivore extends the class animal because these hrbivores are first of all animals
import java.util.*;

public class Herbivore extends Animal {

    Herbivore(String name) {

        // the function super activates the constructor in Animal.Java
        super(name);
        Food hay = new Food("hay");
        Food corn = new Food("corn");
        Food grain = new Food("grain");
        Food carrots = new Food("carrots");
        this.food = new ArrayList<>(Arrays.asList(hay, corn, grain, carrots));
    }
}
