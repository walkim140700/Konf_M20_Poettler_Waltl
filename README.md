# Konf_M20_Poettler_Waltl #

README file for UE2 

**Group M**:
- Kilian Waltl
- Matthias Pöttler

## Shots(Matthias Pöttler) ##

Shots is a java subclass of SimpleDrinks which only contains liqueurs.

- *getBrand()* returns which brand the alcohol is.
- *getIceCubes()* returns if the shots have iceCubes in it. 

## Cocktail(Kilian Waltl) ##

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

## testShots (Matthias Pöttler) ##

To create test in Java with jUnit everything you need to create a void test method wit an **@Test** above it.  The **@BeforeEach** method creates for every **@Test** method a new shot instance. The **@AfterEach** set the instance to null.
You should try to come as close to the **100%** as possible.

**Testcoverage testShots:**

- Class   100 %
- Method  100 %
- Line    100 %

## JavaDoc informations ##

JavaDoc is an documentation tool that should be used so that you and your colleagues know what your code does.
One of the first things every projekt needs is an **README.md** beacuse most of the time it is the first interaction people will have with your code.
When your using JavaDoc in an projekt you have many diffrent tags for diffrent uses.

[![JavaDoc tag table](C:\Users\mpoet\OneDrive\Desktop\2.Semester\Bild\java-documentation-comments.jpg "javaDoc tags")](https://4.bp.blogspot.com/-VbWj_d4yB6s/XCdz58cV_JI/AAAAAAAAFPs/BDCCJaRGJMMMLJteNZmtpYUT6GRRuoaPACLcBGAs/s1600/java-documentation-comments.PNG)
 




