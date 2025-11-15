import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Coffee Shop Menu:");
        System.out.println("Enter A for Americano");
        System.out.println("Enter C for Cappucino");
        System.out.println("Enter L for Latte");
        System.out.println("Enter E for Espresso");
        System.out.println("Enter yout choice:");

        String choice = input.next();

        switch (choice) {
            case "A": System.out.println("Americano-$3.00");
            break;
            case "C": System.out.println("Cappuccino-$3.75");
            break;
            case "L": System.out.println("Latte-$4.00");
            break;
            case "E": System.out.println("Espresso-$2.50");
            break;
            default: System.out.println("Invalid choice.");
            break;
                }
                input.close();
            }
        }
