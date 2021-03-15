# Konf_M20_Poettler_Waltl #

README file for UE2 

**Group M**:
- Kilian Waltl
- Matthias Pöttler

## Shots(Matthias Pöttler) ##

Shots is a java subclass of SimpleDrinks which only contains liqueurs.

- *getBrand()* returns which brand the alcohol is.
- *getIceCubes()* returns if the shots have iceCubes in it. 

## Cocktail(Kilian Waltl ##

Cocktail is a subclass of Drink which can contain a virtually infinite number of different liquids.

- *Cocktail(String name)* creates a new Cocktail object with an empty list of liquids.
- *Cockttail(String name, ArrayList<Liquid> liquids)* creates a new Cocktail object using the specified list of liquids.
- *getNumberOfLiquids()* returns the total number of liquids used in the Cocktail.
- *getLiquid(int index)* returns the liquids with the specified index.
- *addLiquid(Liquid liquid)* adds a liquid to the cocktail.
- *removeLiquid(Object o)* removes a liquid from the cocktail.
- *getVolume()* returns the volume of the cocktail in liters.
- *getAlcoholPercent()* returns the alcohol percentage of the cocktail
- *isAlcoholic()* returns true if the cocktail contains alcohol
- *toString()* returns a fromatted String containing the name of the cocktail and the name of the liquids it contains
