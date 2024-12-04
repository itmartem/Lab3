package enums;

import java.util.Random;

public enum VegetableType {
    CARROT("Морковка"),
    PUMPKIN("Тыква");

    private final String name;
    private int quantity;

    VegetableType(String name) {
        this.name = name;
        this.quantity = new Random().nextInt(11);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printQuantity() {
        System.out.println("Количество " + name + ": " + quantity);
    }
}
