package at.fhj.iit;

public class Shots extends SimpleDrink {

    protected String brand;

    protected boolean iceCubes;

    public Shots(String name, Liquid l, boolean iceCubes, String brand) {
        super(name, l);
        this.iceCubes = iceCubes;
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getIceCubes() {
        return iceCubes;
    }

    public void setIceCubes(boolean iceCubes) {
        this.iceCubes = iceCubes;
    }
}
