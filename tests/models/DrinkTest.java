package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    Drink drink;

    @BeforeEach
    void setUp() {
        drink = new Drink("Iced Americano", "Small");
    }

    @Test
    void setName() {
        drink.setName("Americano");
        assertEquals("Americano", drink.getName());
    }

    @Test
    void setNameInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                drink.setName(""));
    }

    @Test
    void setNameInvalidLowerCase() {
        assertThrows(IllegalArgumentException.class, ()->
                drink.setName("americano"));
    }

    @Test
    void setSize() {
        drink.setSize("Small");
        assertEquals("Small",drink.getSize());
    }

    @Test
    void setInvalidSize() {
        assertThrows(IllegalArgumentException.class, ()->
                drink.setSize("Big"));
    }

    @Test
    void getCost() {
        drink.setSize("Small");
        assertEquals(2.5, drink.getCost());
    }
}