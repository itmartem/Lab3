package models;

import java.util.Random;

public class Apple {
    private String color;
    private boolean ripe; //спелость
    private int quantity;

    public Apple(String color, boolean ripe) {
        this.color = color;
        this.ripe = ripe;
        this.quantity = new Random().nextInt(11); // Случайное количество от 0 до 10
    }

    public Apple(String color, boolean ripe, int quantity) {
        this.color = color;
        this.ripe = ripe;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public boolean isRipe() {
        return ripe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printQuantity() {
        System.out.println("Количество яблок: " + quantity);
    }
}
