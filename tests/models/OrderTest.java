package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderTest {

    Order order;
    Drink drink1;
    Drink drink2;

    @BeforeEach
    void setUp() {
        order = new Order("Chisato");
        drink1 = new Drink("Iced Americano", "Small");
        drink2 = new Drink("Cafe Latte", "Medium");
        order.addOrder(drink1);
        order.addOrder(drink2);
    }

    @Test
    void setName() {
        order.setName("Tom");
        assertEquals("Tom",order.getName());
    }

    @Test
    void setNameInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                order.setName(""));
    }

    @Test
    void setNameInvalidLowerCase() {
        assertThrows(IllegalArgumentException.class, ()->
                order.setName("tom"));
    }

    @Test
    void setNameInvalidNumber() {
        assertThrows(IllegalArgumentException.class, ()->
                order.setName("123Tom"));
    }

    @Test
    void calculateCost() {
        assertEquals(6.0,order.calculateCost());
    }

    @Test
    void getNumOfDrinks() {
        assertEquals(2,order.getNumOfDrinks());
    }

    @Test
    void getDetails(){
        assertEquals("\n\n", order.getDetails());
    }

    @Test
    void testToString() {
        assertEquals("Order Number: 1, Chisato, 2 drinks, total cost: $6.0", order.toString());
    }
}