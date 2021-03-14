package at.fhj.iit;

import java.util.ArrayList;

public class Cocktail extends Drink {

    private ArrayList<Liquid> liquids = new ArrayList();

    /**
     * Creates a Cocktail object with given name, e.g. Long Island or Sex on the Beach
     * Leaves the ArrayList liquids empty
     *
     * @param name name of the drink
     */
    public Cocktail(String name) {
        super(name);
    }

    /**
     * Creates a Cocktail object with given name, e.g. Long Island or Sex on the Beach
     *
     *
     * @param name name of the drink
     * @param liquids ArrayList of liquids included in the cocktail
     */
    public Cocktail(String name, ArrayList<Liquid> liquids) {
        super(name);
        this.liquids=liquids;
    }

    /**
     * getter for the total number of liquids used in the cocktail
     * @return number of liquids
     */
    public int getNumberOfLiquids() {
        return liquids.size();
    }

    /**
     * getter for a liquid used in the cocktail
     * @param index the index of the wanted liquid
     * @return liquid
     */
    public Liquid getLiquid(int index) {
        return liquids.get(index);
    }

    /**
     * Adds a liquid to the cocktail
     * @param liquid The liquid you want to add to the cocktail
     * @return true on success
     */
    public boolean addLiquid(Liquid liquid) {
        return liquids.add(liquid);
    }

    /**
     * Removes a liquid from the cocktail
     * @param o The Liquid to b e removed from the cocktail
     * @return true if the cocktail contains the specified liquid
     */
    public boolean removeLiquid(Object o) {
        return liquids.remove(o);
    }

    /**
     * Getter for the volume of the cocktail
     * @return Volume in liter
     */
    @Override
    public double getVolume() {
        double volume=0;
        for(int i=0;i<liquids.size();i++){
            volume+=liquids.get(i).getVolume();
        }
        return volume;
    }

    /**
     * Getter for the alcohol percent of the cocktail
     * @return alcohol percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcPer=0;
        for(int i=0;i<liquids.size();i++){
            alcPer+=liquids.get(i).getAlcoholPercent();
        }
        return alcPer/ liquids.size();
    }

    /**
     * Returns true if the cocktail contains alcohol
     * @return true if the cocktail is alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        return 0==getAlcoholPercent();
    }

    @Override
    public String toString() {
        return "Cocktail " + name + " containing following liquids: " + liquids.toString();
    }

}
