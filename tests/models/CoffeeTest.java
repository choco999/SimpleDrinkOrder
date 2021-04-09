package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    Coffee coffee;

    @BeforeEach
    void setUp() {
        coffee = new Coffee("Cafe Latte", "Small", true, false, 2, 2);
    }

    @Test
    void setHot() {
        coffee.setHot(true);
        assertTrue(coffee.isHot());
    }

    @Test
    void setDecaf() {
        coffee.setDecaf(true);
        assertTrue(coffee.isDecaf());
    }

    @Test
    void setNumOfSugar() {
        coffee.setNumOfSugar(2);
        assertEquals(2, coffee.getNumOfSugar());
    }

    @Test
    void setNumOfSugarInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                coffee.setNumOfSugar(7));
    }

    @Test
    void setNumOfCream() {
        coffee.setNumOfCream(2);
        assertEquals(2, coffee.getNumOfCream());
    }

    @Test
    void setNumOfCreamInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                coffee.setNumOfSugar(-1));
    }

    @Test
    void getCalories() {
        assertEquals(72, coffee.getCalories());
    }

    @Test
    void getBlendName() {
        assertEquals("Double Double", coffee.getBlendName());
    }

    @Test
    void testToString() {
        assertEquals("Cafe Latte, size: Small, sugar: 2, cream: 2",coffee.toString());
    }
}