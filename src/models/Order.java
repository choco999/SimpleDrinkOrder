package models;

import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Drink> orders;
    private int orderNumber;

    private static int number = 0;

    public Order(String name) {
        setName(name);
        orders = new ArrayList<>();
        number++;
        this.orderNumber = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();
        if (name.length() >= 2){
            name = name.substring(0,1).toUpperCase() + name.substring(1);
            if(name.matches("[A-Z][a-z]*"))
                this.name = name;
            else
                throw new IllegalArgumentException("Your name must start with an upper case letter");
        }
        else {
            throw new IllegalArgumentException("Your name must have at least 2 characters");
        }

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void addOrder(Drink drink){
        orders.add(drink);
    }

    public double calculateCost(){
        double totalCost = 0;
        for (Drink drink : orders)
            totalCost += drink.getCost();

        return totalCost;
    }

    public int getNumOfDrinks(){
        return orders.size();
    }

    public String toString(){
        return String.format("Order Number: %d, %s, %d drinks, total cost: $%.1f", orderNumber, name, getNumOfDrinks(), calculateCost());
    }

    public String getDetails(){
        String output = "";
        for (Drink drink : orders){
            output += drink.toString();
            output += "\n";
        }

        return output;
    }
}
