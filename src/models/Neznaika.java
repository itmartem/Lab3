package models;

public class Neznaika extends Baby {

    public Neznaika(String name, int age) {
        super(name, age, "Исследователь");
    }

    public void laugh() {
        this.isLaughing = true;
        System.out.println(name + " захлёбывается от смеха.");
    }

    @Override
    public void speak() {
        System.out.println(name + ": \"Ха-ха, как весело!\"");
    }
}
