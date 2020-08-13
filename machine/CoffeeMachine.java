package machine;

import java.util.Scanner;

import machine.logic.Coffeemat;
import machine.ui.TextUserInterface;
import machine.ui.UserInterface;


public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coffeemat coffeemaker1 = new Coffeemat(9,400,120, 540, 550);
        UserInterface uit = new TextUserInterface(coffeemaker1, sc);
        uit.start();

    }
}  
