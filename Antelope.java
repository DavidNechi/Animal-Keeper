
//creating the class Antelope, which extends the herbivore class, which extends the animal class

//The difference with the Antelope class is that it is not allowed to eat any carrots,
//so the list of food atributed to it needs to have carrots deleted, but just for him

package Animal.Herbivore;

public class Antelope extends Herbivore {

    public Antelope(String name) {
        super(name);

        // gets carrots deleted from its food list
        for (int i = 0; i < this.food.size(); i++) {
            // when the positions name in t=he list is eual to "carrots" its deleted
            if (this.food.get(i).getType().equals("carrots")) {
                this.food.remove(i);
                break;
            }
        }
    }
}
