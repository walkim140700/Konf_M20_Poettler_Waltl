package at.fhj.iit;

/**
 * represents a shot drinks and the liquid which can be used in drinks
 */

public class Shots extends SimpleDrink {


    /**
     * name of the liquid brand
     */

    protected String brand;


    protected boolean iceCubes;

    /**
     * creates a shot drink objekt with one liqure
     */

    public Shots(String name, Liquid l, boolean iceCubes, String brand) {
        super(name, l);
        this.iceCubes = iceCubes;
        this.brand = brand;

    }

    /**
     * getter for what brand is used in the shots and if it contains ice cubes
     */

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
