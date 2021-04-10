package utilities;

import models.Coffee;
import models.Juice;

import java.util.ArrayList;

public class DBUtility {
    private static ArrayList<Coffee> cupsOfCoffee;

    public static ArrayList<Coffee> getCoffeeFromDB(){
        cupsOfCoffee = new ArrayList<>();

        cupsOfCoffee.add(new Coffee("Americano", "Small", true, false, 1,2));
        cupsOfCoffee.add(new Coffee("Affogato", "Medium", true, false, 2,2));
        cupsOfCoffee.add(new Coffee("Cappuccino", "Small", true, false, 3,1));
        cupsOfCoffee.add(new Coffee("Caffe Latte", "Small", false, false, 1,1));
        cupsOfCoffee.add(new Coffee("Cold brew coffee", "Large", false, true, 2,1));

        return cupsOfCoffee;
    }

    public static ArrayList<Juice> getJuiceFromDB(){

        ArrayList<Juice> cupsOfJuice = new ArrayList<>();

        Juice juice1 = new Juice("Apple Juice","Small",false);
        Juice juice2 = new Juice("Strawberry Juice","Large",false);
        Juice juice3 = new Juice("Pineapple Juice","Small",true);

        cupsOfJuice.add(juice1);
        juice1.addIngredient("apple");

        cupsOfJuice.add(juice2);
        juice2.addIngredient("lemon");
        juice2.addIngredient("orange");

        cupsOfJuice.add(juice3);
        juice3.addIngredient("pineapple");

        return cupsOfJuice;
    }

    public static void insertCoffeeIntoDB(Coffee newCoffee){
        //getCoffeeFromDB();
        cupsOfCoffee.add(newCoffee);
    }


}
