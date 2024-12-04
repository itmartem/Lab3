package models;

public abstract class Baby {
    protected String name;
    protected int age;
    protected String profession;
    protected boolean isLaughing;

    public Baby(String name, int age, String profession) { //конструктор создания объекта
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.isLaughing = false; // По умолчанию малыш не смеётся
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public boolean isLaughing() {
        return isLaughing;
    }

    public void setLaughing(boolean laughing) {
        this.isLaughing = laughing;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "Baby{" +
                "Имя='" + name +
                ",Возраст=" + age +
                ",Профессия=" + profession +
                ",Смех=" + isLaughing +
                '}';
    }
}
