package machine.logic;

public class Coffeemat {

    private int cups;         // number of
    private int water;        // in ml
    private int coffee;       // in g
    private int milk;         // in ml
    private int money;        // in dol

    public Coffeemat(int cups, int water, int coffee, int milk, int money) {
        this.cups = cups;
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
        this.money = money;
    }

    public int getCups() { return cups; }

    public void setCups(int cups) { this.cups = cups; }

    public void addCups(int cups) { this.cups += cups; }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void addWater(int water) {
        this.water += water;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void addCoffee(int coffee) {
        this.coffee += coffee;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void addMilk(int milk) {
        this.milk += milk;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void espresso() {
        if (this.water > 250 && this.coffee > 16 && this.cups > 0) {
            this.water -= 250;
            this.coffee -= 16;
            this.cups--;
            this.money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (this.water < 250) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.coffee < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups");
        }
    }

    public void late() {
        if (this.water > 350 && this.coffee > 20 && this.milk > 75 && this.cups > 0) {
            this.water -= 350;
            this.coffee -= 20;
            this.milk -= 75;
            this.cups--;
            this.money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (this.water < 350) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.coffee < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.milk < 75) {
            System.out.println("Sorry, not enough milk");
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups");
        }
    }

    public void cappuccino() {
        if (this.water > 200 && this.coffee > 12 && this.milk > 100 && this.cups > 0) {
            this.water -= 200;
            this.coffee -= 12;
            this.milk -= 100;
            this.cups--;
            this.money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (this.water < 200) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.coffee < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.milk < 100) {
            System.out.println("Sorry, not enough milk");
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups");
        }
    }
}
package machine.logic;

public class Coffeemat {

    private int cups;         // number of
    private int water;        // in ml
    private int coffee;       // in g
    private int milk;         // in ml
    private int money;        // in dol

    public Coffeemat(int cups, int water, int coffee, int milk, int money) {
        this.cups = cups;
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
        this.money = money;
    }

    public int getCups() { return cups; }

    public void setCups(int cups) { this.cups = cups; }

    public void addCups(int cups) { this.cups += cups; }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void addWater(int water) {
        this.water += water;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void addCoffee(int coffee) {
        this.coffee += coffee;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void addMilk(int milk) {
        this.milk += milk;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void espresso() {
        if (this.water > 250 && this.coffee > 16 && this.cups > 0) {
            this.water -= 250;
            this.coffee -= 16;
            this.cups--;
            this.money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (this.water < 250) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.coffee < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups");
        }
    }

    public void late() {
        if (this.water > 350 && this.coffee > 20 && this.milk > 75 && this.cups > 0) {
            this.water -= 350;
            this.coffee -= 20;
            this.milk -= 75;
            this.cups--;
            this.money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (this.water < 350) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.coffee < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.milk < 75) {
            System.out.println("Sorry, not enough milk");
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups");
        }
    }

    public void cappuccino() {
        if (this.water > 200 && this.coffee > 12 && this.milk > 100 && this.cups > 0) {
            this.water -= 200;
            this.coffee -= 12;
            this.milk -= 100;
            this.cups--;
            this.money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (this.water < 200) {
            System.out.println("Sorry, not enough water!");
        }
        if (this.coffee < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        }
        if (this.milk < 100) {
            System.out.println("Sorry, not enough milk");
        }
        if (this.cups < 1) {
            System.out.println("Sorry, not enough cups");
        }
    }
}
