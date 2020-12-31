package machine;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need:");
        int water = 400;
        int milk = 540;
        int grams = 120;
        int cups = 9;
        int money = 550;
        boolean flag = true;

        while (flag) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String command = scanner.next();
            switch (command) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffee = scanner.next();
                    switch (coffee) {
                        case "1":
                            if (water >= 250 && grams >=16 && cups >=1) {
                                water -= 250;
                                grams -= 16;
                                money += 4;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water <250) System.out.println("Sorry, not enough water!");
                            else if (grams<16) System.out.println("Sorry, not enough coffee beans!");
                            else if (cups < 1) System.out.println("Sorry, not enough disposable cups");
                            break;
                        case "2":
                            if (water >= 350 && grams >=20 && cups >=1 && milk>=75) {
                                water -= 350;
                                milk -= 75;
                                grams -= 20;
                                money += 7;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 350) System.out.println("Sorry, not enough water!");
                            else if (grams<20) System.out.println("Sorry, not enough coffee beans!");
                            else if (cups < 1) System.out.println("Sorry, not enough disposable cups");
                            else System.out.println("Sorry, not enough milk");
                            break;
                        case "3":
                            if (water >= 200 && grams >=12 && cups >=1 && milk>=100) {
                                water -= 200;
                                milk -= 100;
                                grams -= 12;
                                money += 6;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 200) System.out.println("Sorry, not enough water!");
                            else if (grams<12) System.out.println("Sorry, not enough coffee beans!");
                            else if (cups < 1) System.out.println("Sorry, not enough disposable cups");
                            else System.out.println("Sorry, not enough milk");
                            break;
                        default:
                            continue;
                    }
                    continue;
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water do you want to add: ");
                    int water1 = scanner.nextInt();
                    water +=water1;
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int milk1 = scanner.nextInt();
                    milk +=milk1;
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int grams1 = scanner.nextInt();
                    grams +=grams1;
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int cups1 = scanner.nextInt();
                    cups +=cups1;
                    continue;
                case "take":
                    System.out.println();
                    System.out.printf("I gave you $%d", money);
                    money = 0;
                    System.out.println();
                    continue;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(grams + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println("$" + money + " of money");
                    continue;
                default:
                    flag = false;

            }

        }
    }
}
