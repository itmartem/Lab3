package models;

import enums.VegetableType;
import exceptions.FruitException;

public class GardenBaby extends Baby {

    public GardenBaby(String name, int age) {
        super(name, age, "Огородник");
    }

    public void harvestVegetable(VegetableType vegetable) {
        if (vegetable.getQuantity() == 0) {
            throw new FruitException("Нет " + vegetable.getName() + " для уборки!");
        }
        System.out.println(name + " обкапывает " + vegetable.getQuantity() + " " + vegetable.getName() + " и вытаскивает из земли.");
    }

    @Override
    public void speak() {
        System.out.println(name + ": \"Я убираю грядки!\"");
    }
}
