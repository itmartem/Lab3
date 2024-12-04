import java.util.ArrayList;
import java.util.List;

public class HarvestStorage {
    private final List<String> harvestedVegetables = new ArrayList<>();
    private final List<String> harvestedFruits = new ArrayList<>();

    public void addVegetable(String vegetable) {
        harvestedVegetables.add(vegetable);
    }

    public void addFruit(String fruit) {
        harvestedFruits.add(fruit);
    }


    public void printVegetables() {
        System.out.println("\nСобранные овощи:");
        if (harvestedVegetables.isEmpty()) {
            System.out.println("Нет собранных овощей.");
        }
        else {
            for (String vegetable : harvestedVegetables) {
                System.out.println(vegetable);
            }
        }
    }

    public void printFruits() {
        System.out.println("\nСобранные фрукты:");
        if (harvestedFruits.isEmpty()) {
            System.out.println("Нет собранных фруктов.");
        }
        else {
            for (String fruit : harvestedFruits) {
                System.out.println(fruit);
            }
        }
    }
}
