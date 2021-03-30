package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    Drink drink;

    @BeforeEach
    void setUp() {
        drink = new Drink("Iced Caffe Americano", 1);
    }

    @Test
    void getName() {
        drink.getName();
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
    void getSize() {
        drink.getSize();
    }

    @Test
    void setSize() {
        drink.setSize(1);
        assertEquals(1,drink.getSize());
    }

    @Test
    void setInvalidSize() {
        assertThrows(IllegalArgumentException.class, ()->
                drink.setSize(4));
    }

//    @Test
//    void getCost() {
//        drink.setSize(1);
//        assertEquals(2.5, drink.getCost());
//    }
}