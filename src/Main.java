import enums.*;
import models.*;
import exceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //ввод
        HarvestStorage harvestStorage = new HarvestStorage(); //хранение собранного

        Neznaika neznaika = new Neznaika("Незнайка", 10);
        GardenBaby gardenBaby = new GardenBaby("Малышка Огородница", 8);
        TreeBaby treeBaby = new TreeBaby("Малышка Яблонька", 7);
        AppleTree appleTree = new AppleTree();
        Branch branch = new Branch(3.0, 4);
        //овощ
        System.out.println("Вы хотите задать количество овощей и яблок вручную? (да/нет)");
        String userInput = scanner.nextLine().trim().toLowerCase();
        if (userInput.equals("да")) {
            for (VegetableType vegetable : VegetableType.values()) {
                System.out.print("Введите количество для " + vegetable.getName() + ": ");
                int quantity = scanner.nextInt();
                vegetable.setQuantity(quantity);
            }
        }
        else {
            System.out.println("Количество овощей и яблок будет случайным.");
        }
        //фрукты
        Apple apple;
        if (userInput.equals("да")) {
            System.out.print("Введите количество яблок: ");
            int appleCount = scanner.nextInt();
            apple = new Apple("Красное", true, appleCount);
        }
        else {
            apple = new Apple("Красное", true);
        }
        branch.addApple(apple);

        try {
            neznaika.laugh();
            System.out.println("\nСбор овощей на грядке:");
            for (VegetableType vegetable : VegetableType.values()) {
                gardenBaby.harvestVegetable(vegetable);
                harvestStorage.addVegetable(vegetable.getName() + ": " + vegetable.getQuantity() + " шт.");
            }
            TreeType.APPLE_TREE.printInfo();
            treeBaby.collectApples(branch);

            harvestStorage.addFruit("Яблоки: " + branch.getAppleCount() + " шт.");

            appleTree.grow();
        } catch (LadderException e) {
            System.err.println(e.getMessage());
        } catch (FruitException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: " + e.getMessage());
        }

        harvestStorage.printVegetables();
        harvestStorage.printFruits();

        while (true) {
            String input = scanner.nextLine().trim();
            switch (input) {
                case "Neznaika":
                    System.out.println(neznaika);
                    break;
                case "TreeBaby":
                    System.out.println(treeBaby);
                    break;
                case "GardenBaby":
                    System.out.println(gardenBaby);
                    break;
                case "AppleTree":
                    appleTree.printInfo();
                    break;
                case "exit":
                    System.out.println("Выход из программы.");
                    return;
            }
        }
    }
}
