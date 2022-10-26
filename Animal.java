
//The class Animal is the main class as every entity in the zoo are animals, and have common traits,
//such as a name and the fact that they need to eat food 

import java.util.List;


public class Animal {
    
    private String name;
    protected List<Food> food;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Food> getFood(){
        return this.food;
    }

}