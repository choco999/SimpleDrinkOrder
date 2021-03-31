package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    Coffee coffee;

    @BeforeEach
    void setUp() {
        coffee = new Coffee("Cafe Latte", 1, true, false, 2, 2);
    }

    @Test
    void isHot() {
        coffee.isHot();
    }

    @Test
    void setHot() {
        coffee.setHot(true);
        assertTrue(coffee.isHot());
    }

    @Test
    void isDecaf() {
        coffee.isDecaf();
    }

    @Test
    void setDecaf() {
        coffee.setDecaf(true);
        assertTrue(coffee.isDecaf());
    }

    @Test
    void getNumOfSugar() {
        coffee.getNumOfSugar();
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
    void getNumOfCream() {
        coffee.getNumOfCream();
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
}