package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Machine machine = new Machine(400,540,120,9,550);

        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = s.nextLine();
            switch (action) {
                case "take":
                    System.out.println("I gave you $"+machine.getCurrentBalance());
                    machine.setCurrentBalance(0);
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterAdded = s.nextInt();
                    int currWater = machine.getCurrentWater();
                    machine.setCurrentWater(waterAdded + currWater);
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkAdded = s.nextInt();
                    int currMilk = machine.getCurrentMilk();
                    machine.setCurrentMilk(milkAdded + currMilk);
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int beansAdded = s.nextInt();
                    int currBeans = machine.getCurrentCoffeeBeans();
                    machine.setCurrentCoffeeBeans(beansAdded + currBeans);
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cupsAdded = s.nextInt();
                    int currCups = machine.getCurrentCups();
                    machine.setCurrentCups(cupsAdded + currCups);
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = s.nextLine();
                    switch (choice) {
                        case "1":
                            machine.pourEspresso();
                            break;
                        case "2":
                            machine.pourLatte();
                            break;
                        case "3":
                            machine.pourCappuccino();
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Wrong Choice!");
                            break;
                    }
                    break;
                case "remaining":
                    printCurrentMachineStatus(machine);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong Choice!");
                    break;
            }
        }
    }

    private static void printCurrentMachineStatus(Machine machine) {
        String msg = String.format("The coffee machine has:\n" +
                        "%d of water\n" +
                        "%d of milk\n" +
                        "%d of coffee beans\n" +
                        "%d of disposable cups\n" +
                        "%d of money",machine.getCurrentWater(),
                machine.getCurrentMilk(),machine.getCurrentCoffeeBeans(),
                machine.getCurrentCups(),machine.getCurrentBalance());
        System.out.println(msg);
    }
}