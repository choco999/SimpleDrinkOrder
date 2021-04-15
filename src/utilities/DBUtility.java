package utilities;

import models.Coffee;
import models.Juice;
import models.Order;

import java.util.ArrayList;

public class DBUtility {
    private static ArrayList<Coffee> cupsOfCoffee;
    private static ArrayList<Juice> cupsOfJuice;
    private static ArrayList<Order> orders;


    public static ArrayList<Coffee> getCoffeeFromDB(){
        if (cupsOfCoffee == null) {
            cupsOfCoffee = new ArrayList<>();

            cupsOfCoffee.add(new Coffee("Americano", "Small", true, false, 1, 2));
            cupsOfCoffee.add(new Coffee("Affogato", "Medium", true, false, 2, 2));
            cupsOfCoffee.add(new Coffee("Cappuccino", "Small", true, false, 3, 1));
            cupsOfCoffee.add(new Coffee("Caffe Latte", "Small", false, false, 1, 1));
            cupsOfCoffee.add(new Coffee("Cold brew coffee", "Large", false, true, 2, 1));
        }
        return cupsOfCoffee;
    }

    public static void insertCoffeeIntoDB(Coffee newCoffee){
        cupsOfCoffee.add(newCoffee);
    }

    public static ArrayList<Juice> getJuiceFromDB(){
        if (cupsOfJuice == null){
            cupsOfJuice = new ArrayList<>();

            Juice juice1 = new Juice("Apple Juice","Small",false);
            Juice juice2 = new Juice("Strawberry Juice","Large",false);
            Juice juice3 = new Juice("Pineapple Juice","Small",true);

            cupsOfJuice.add(juice1);
            juice1.addIngredient("apple");

            cupsOfJuice.add(juice2);
            juice2.addIngredient("strawberry");
            juice2.addIngredient("orange");

            cupsOfJuice.add(juice3);
            juice3.addIngredient("pineapple");
        }
        return cupsOfJuice;
    }

    public static void insertJuiceIntoDB(Juice newJuice){
        cupsOfJuice.add(newJuice);
    }


    public static ArrayList<Order> getOrderFromDB(){
        ArrayList<Coffee> coffee = getCoffeeFromDB();
        ArrayList<Juice> juice = getJuiceFromDB();

        if(orders == null){
            Order order1 = new Order("Chisato");
            order1.addOrder(coffee.get(0));
            order1.addOrder(juice.get(0));

            Order order2 = new Order("Emma");
            order2.addOrder(coffee.get(1));

            Order order3 = new Order("Tom");
            order3.addOrder(coffee.get(2));
            order3.addOrder(coffee.get(3));
            order3.addOrder(juice.get(1));

            orders = new ArrayList<>();
            orders.add(order1);
            orders.add(order2);
            orders.add(order3);
        }
        return orders;
    }

    public static void insertOrderIntoDB(Order newOrder){
        orders.add(newOrder);
    }




}
