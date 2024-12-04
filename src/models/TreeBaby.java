package models;

import exceptions.LadderException;
import exceptions.FruitException;

public class TreeBaby extends Baby {

    public TreeBaby(String name, int age) {
        super(name, age, "Собиратель яблок");
    }

    public void collectApples(Branch branch) throws LadderException {
        if (!branch.hasLadder()) {
            throw new LadderException("Лестница слишком короткая! Длина: " + branch.getLadderLength() +
                    " м, требуется: " + branch.getBranchHeight() + " м.");
        }
        if (branch.getAppleCount() == 0) {
            throw new FruitException("На ветке нет яблок!");
        }

        System.out.println(name + " собирает " + branch.getAppleCount() + " яблок(а) с ветки на высоте " + branch.getBranchHeight() + " м.");
    }

    @Override
    public void speak() {
        System.out.println(name + ": Я собираю яблоки!");
    }
}
