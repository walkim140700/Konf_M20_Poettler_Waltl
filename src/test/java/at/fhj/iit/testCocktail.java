package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testCocktail {
    private Cocktail cocktail;

    @BeforeEach
    void setUp(){
        Liquid rum = new Liquid("Rum", 0.04, 40);
        Liquid coke = new Liquid("Coke", 0.16, 0);
        cocktail = new Cocktail("Rum-Coke");
        cocktail.addLiquid(rum);
        cocktail.addLiquid(coke);
    }

    @AfterEach
    void tearDown(){
        cocktail=null;
    }

    @Test
    @DisplayName("Tests if getNumberOfLiquids is correct")
    void testNumberOfLiquids(){assertEquals(2,cocktail.getNumberOfLiquids());}

    @Test
    @DisplayName("Tests if getAlcoholPercent is correct")
    void testGetAlcoholPercent(){assertEquals(8,cocktail.getAlcoholPercent());}

    @Test
    @DisplayName("Tests if getVolume is correct")
    void testGetVolume(){assertEquals(0.2,cocktail.getVolume());}

    @Test
    @DisplayName("Tests if isAlcoholic is correct")
    void testIsAlcoholic(){assertTrue(cocktail.isAlcoholic());}

    @Test
    @DisplayName("Tests if toString is returning the right String")
    void testToString(){assertEquals("Cocktail Rum-Coke containing following liquids: [Rum, Coke]",cocktail.toString());}
}
