package utilities;

import models.Coffee;
import models.Juice;

import java.util.ArrayList;

public class DBUtility {
    public static ArrayList<Coffee> getCoffeeFromDB(){
        ArrayList<Coffee> cupsOfCoffee = new ArrayList<>();

        cupsOfCoffee.add(new Coffee("Americano", 1, true, false, 1,2));
        cupsOfCoffee.add(new Coffee("Affogato", 2, true, false, 2,2));
        cupsOfCoffee.add(new Coffee("Cappuccino", 1, true, false, 3,1));
        cupsOfCoffee.add(new Coffee("Caffe Latte", 1, true, false, 1,1));

        return cupsOfCoffee;
    }

    public static ArrayList<Juice> getJuiceFromDB(){
        ArrayList<Juice> cupsOfJuice = new ArrayList<>();

        cupsOfJuice.add(new Juice("Apple Juice",1,false));
        cupsOfJuice.add(new Juice("Orange Juice",2,true));
        cupsOfJuice.add(new Juice("Strawberry Juice",3,false));
        cupsOfJuice.add(new Juice("Pineapple Juice",1,true));

        return cupsOfJuice;
    }
}
