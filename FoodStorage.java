//creating the class food so that the program can buy food and discard food

public class FoodStorage extends Food {

    private int storageSize;

    public FoodStorage(String type) {
        super(type);
        storageSize = 0;
    }

    // algoritm that return false when it buys too much food(more than 100)
    // and true when the right amount of food is buyed
    public boolean storeFood(int storingAmount) {
        if (storageSize + storingAmount > 100)
            return false;
        storageSize += storingAmount;
        return true;
    }

    // algorithm that returns false when it does not have enough food as needed
    // and true when it does
    public boolean discardFood(int discardingAmount) {
        if (discardingAmount > storageSize)
            return false;
        storageSize -= discardingAmount;
        return true;
    }

}
