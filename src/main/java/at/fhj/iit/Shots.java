package at.fhj.iit;

/**
 * represents a shot drinks and the liquid which can be used in drinks
 */

public class Shots extends SimpleDrink {


    /**
     * name of the liquid brand and if the shot has ice cubes.
     */

    protected String brand;


    protected boolean iceCubes;

    /**
     * creates a shot drink objekt with one liqure
     * @param name of the drink
     * @param l name of the liquid that is in the drink
     * @param iceCubes if the drink has icecubes or no icecubes
     * @param brand name of the brand that the liquir is.
     */

    public Shots(String name, Liquid l, boolean iceCubes, String brand) {
        super(name, l);
        this.iceCubes = iceCubes;
        this.brand = brand;

    }

    /**
     * @return the name of the liquid brand
     */

    public String getBrand() {
        return brand;
    }

    /**
     *
     * @return true or false if there are ice cubes in the shot
     */

    public boolean getIceCubes() {
        return iceCubes;
    }

}
