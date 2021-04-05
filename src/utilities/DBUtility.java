package utilities;

import models.Coffee;
import models.Juice;

import java.util.ArrayList;

public class DBUtility {
    public static ArrayList<Coffee> getCoffeeFromDB(){
        ArrayList<Coffee> cupsOfCoffee = new ArrayList<>();

        cupsOfCoffee.add(new Coffee("Americano", "Small", true, false, 1,2));
        cupsOfCoffee.add(new Coffee("Affogato", "Medium", true, false, 2,2));
        cupsOfCoffee.add(new Coffee("Cappuccino", "Small", true, false, 3,1));
        cupsOfCoffee.add(new Coffee("Caffe Latte", "Small", false, false, 1,1));
        cupsOfCoffee.add(new Coffee("Cold brew coffee", "Large", false, true, 2,1));

        return cupsOfCoffee;
    }

    public static ArrayList<Juice> getJuiceFromDB(){
        ArrayList<Juice> cupsOfJuice = new ArrayList<>();

        cupsOfJuice.add(new Juice("Apple Juice","Small",false));
        cupsOfJuice.add(new Juice("Orange Juice","Medium",true));
        cupsOfJuice.add(new Juice("Strawberry Juice","Large",false));
        cupsOfJuice.add(new Juice("Pineapple Juice","Small",true));

        return cupsOfJuice;
    }
}
