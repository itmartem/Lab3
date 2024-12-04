package models;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Apple> apples;
    private double branchHeight; // Высота ветки
    private double ladderLength; // Длина лестницы

    public Branch(double branchHeight, double ladderLength) {
        this.apples = new ArrayList<>();
        this.branchHeight = branchHeight;
        this.ladderLength = ladderLength;
    }

    public boolean hasLadder() {
        return ladderLength >= branchHeight; // Проверка: лестница достигает ветки
    }

    public List<Apple> getApples() {
        return apples;
    }

    public int getAppleCount() {
        return apples.stream().mapToInt(Apple::getQuantity).sum(); //преобразует список в потопк и потом в числовое значение
    }

    public void addApple(Apple apple) {
        apples.add(apple);
        apple.printQuantity();
    }

    public double getBranchHeight() {
        return branchHeight;
    }

    public double getLadderLength() {
        return ladderLength;
    }
}
