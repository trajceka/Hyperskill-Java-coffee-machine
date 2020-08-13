package machine.ui;

import machine.logic.Coffeemat;

import java.util.Scanner;

public class TextUserInterface implements UserInterface {

    private Coffeemat coffeemat;
    private Scanner sc;

    public TextUserInterface(Coffeemat coffeemat, Scanner sc) {
        this.coffeemat = coffeemat;
        this.sc = sc;
    }

    @Override
    public void start() {
        this.writeAction();
    }

    private void displayState() {
        System.out.println("The coffee machine has:");
        System.out.println(coffeemat.getWater() + " of water");
        System.out.println(coffeemat.getMilk() + " of milk");
        System.out.println(coffeemat.getCoffee() + " of coffee beans");
        System.out.println(coffeemat.getCups() + " of disposable cups");
        System.out.println(coffeemat.getMoney() + " of money");
    }

    private void writeAction() {
        for (;;) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String command = sc.nextLine();
            if (command.equals("exit")) {
                break;
            }
            if (command.equals("buy")) {
                this.buy();
            }
            if (command.equals("fill")) {
                this.fill();
            }
            if (command.equals("take")) {
                this.take();
            }
            if (command.equals("remaining")) {
                this.displayState();
            }
        }
    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String command = sc.nextLine();
        if (command.equals("1")) {
            coffeemat.espresso();
        }
        if (command.equals("2")) {
            coffeemat.late();
        }
        if (command.equals("3")) {
            coffeemat.cappuccino();
        }
        // if (command.equals("back")) { }
    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        coffeemat.addWater(Integer.parseInt(sc.nextLine()));
        System.out.println("Write how many ml of milk do you want to add: ");
        coffeemat.addMilk(Integer.parseInt(sc.nextLine()));
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeemat.addCoffee(Integer.parseInt(sc.nextLine()));
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        coffeemat.addCups(Integer.parseInt(sc.nextLine()));
    }

    private void take() {
        System.out.println("I gave you $" + coffeemat.getMoney());
        coffeemat.setMoney(0);
    }



    /*
    private void commented() {


        // System.out.println("Write how many ml of water the coffee machine has: ");

        // int water = Integer.parseInt(sc.nextLine());
        // int cWater = water / 200;

        // System.out.println("Write how many ml of milk the coffee machine has: ");

        // int milk = Integer.parseInt(sc.nextLine());
        // int cMilk = milk / 50;

        // System.out.println("Write how many grams of coffee beans the coffee machine has: ");

        // int coffeeBeansIng = Integer.parseInt(sc.nextLine());
        // int cCoffee = coffeeBeansIng / 15;

        // int mc = Math.min(Math.min(cWater, cMilk), cCoffee);

        // System.out.println("Write how many cups of coffee you will need: ");

        // int cups = Integer.parseInt(sc.nextLine());

        // int rc = mc - cups;

        // if (rc > 0) {
        //     System.out.println("Yes, I can make that amount of coffee (and even " + rc + " more than that)");
        // } else if (rc < 0) {
        //     System.out.println("No, I can make only " + mc + " cup(s) of coffee");
        // } else {
        //     System.out.println("Yes, I can make that amount of coffee");
        // }

        // System.out.println("For " + cups + " cups of coffee you will need:");
        // System.out.println(200 * cups + " ml of water");
        // System.out.println(50 * cups + " ml of milk");
        // System.out.println(15 * cups + " g of coffee beans");

        // System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");

    }
    */
}
