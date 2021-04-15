package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JuiceTest {

    Juice juice;

    @BeforeEach
    void setUp() {
        juice = new Juice("Apple Juice", "Small", false);
        juice.addIngredient("Apple");
    }

    @Test
    void addIngredient() {
        //juice.addIngredient("Apple");
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Apple");
        assertEquals(expResult, juice.getIngredients());
    }

    @Test
    void addIngredientInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                juice.addIngredient("Peach"));
    }

    @Test
    void addIngredientInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                juice.addIngredient(""));
    }

    @Test
    void setHasPulp() {
        juice.setHasPulp(true);
        assertTrue(juice.hasPulp());
    }

    @Test
    void getNumOfIngredients() {
        juice.addIngredient("Orange");
        assertEquals(2,juice.getNumOfIngredients());
    }

    @Test
    void testToString() {
        assertEquals("Apple Juice, size: Small, 1 ingredients",juice.toString());
    }

}