//Student Name: Andrei David Nechitoaia
//Student ID: 1806130
//
//Animal keeper is the class that imports the enire zoo in oirder to take an imput and returning the good output
//for every task, if a task returns  false than it means that an error occured during the procces and the task is 
//outouted with a ! at the end, refering to the existing error.

import java.util.*;

public class AnimalKeeper {
    Scanner sc = new Scanner(System.in);

    public void main() {

        MyZoo myZoo = new MyZoo();

        boolean ok = false;

        while (sc.hasNext()) {
            int task = sc.nextInt();

            if (task == 0) {
                int type = sc.nextInt();
                String name = sc.next();
                int homeIndex = sc.nextInt();
                ok = myZoo.addAnimalWithTypeAndNameToHome(type, name, homeIndex);
            } else if (task == 1) {
                String name = sc.next();
                int homeIndex = sc.nextInt();
                ok = myZoo.moveAnimalWithNameToOtherHome(name, homeIndex);
            } else if (task == 2) {
                String name = sc.next();
                ok = myZoo.removeAnimalWithNameFromZoo(name);
            } else if (task == 3) {
                int type = sc.nextInt();
                int amount = sc.nextInt();
                ok = myZoo.buyFoodOfTypeTheAmount(type, amount);
            } else if (task == 4) {
                int type = sc.nextInt();
                int amount = sc.nextInt();
                int homeIndex = sc.nextInt();
                ok = myZoo.feedFoodWithTypeAndAmountAndHome(type, amount, homeIndex);
            }

            System.out.print(task);

            if (ok == false)
                System.out.print("!");
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        new AnimalKeeper().main();
    }
}