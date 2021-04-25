package at.fhj.iit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Matthias Pöttler
 * @version 1.0
 * @see Shots
 */

public class testShots {

    private Shots shotDrink;

    @BeforeEach
    void setUp(){
        Liquid liq = new Liquid("Tequilla", 0.02,40);
        shotDrink = new Shots("Tequilla" , liq , true, "Omeca");
    }

    @AfterEach
    void tearDown(){
        shotDrink = null;
    }

    @Test
    @DisplayName("Tests what brand will return")
        void testWhatBrand(){
            assertEquals("Omeca", shotDrink.getBrand());
        }

    @Test
    @DisplayName("Tests if the return of the Ice cubes is correct")
         void testBooleanIceCubes () {
        assertTrue(shotDrink.getIceCubes());
    }

    @Test
    @DisplayName("Tests if the Drinks is alkohloic")
        void testIsItAlkohloic(){
        assertTrue(shotDrink.isAlcoholic());
    }

    @Test
    @DisplayName("Ttests if the return of Volume is correct")
        void testVolume (){
            assertEquals(0.02,shotDrink.getVolume());
    }

    @Test
    @DisplayName("Test the toString Method")
        void testToString(){
            assertEquals("Simple Drink called Tequilla with 40.0 percent alcohol by volume", shotDrink.toString());
    }

    @Test
    @DisplayName("Test the Alkhol percentage")
        void testGetAlkholPercentage(){
        assertEquals(40,shotDrink.getAlcoholPercent());
    }

    @Test
    @DisplayName("Tests the Values of Shots")
        void testValues(){
        assertTrue(shotDrink.iceCubes);
        assertEquals("Omeca", shotDrink.brand);
    }



}










