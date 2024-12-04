package enums;

public enum TreeType {
    APPLE_TREE("Яблоня", 5.0),
    CHERRY_TREE("Вишня", 4.0),
    PEAR_TREE("Груша", 6.0);

    private final String name;
    private final double height;

    TreeType(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void printInfo() {
        System.out.println(name + " с высотой " + height + " м.");
    }
}
