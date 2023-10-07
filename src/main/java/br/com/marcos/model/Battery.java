package br.com.marcos.model;

public class Battery {

    private String model;
    private String manufacturer;
    private int health;
    private int level;

    public Battery() {

    }

    public Battery(String model, String manufacturer) {
        setModel(model);
        setManufacturer(manufacturer);
        setHealth(100);
        setLevel(100);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void info() {
        System.out.println("Battery { model:" + getModel() + " manufacturer: "
                + getManufacturer() + "health: " + getHealth() + "level: " + getLevel());
    }
}
