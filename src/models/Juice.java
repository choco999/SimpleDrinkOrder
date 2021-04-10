package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Juice extends Drink {
    private ArrayList<String> ingredients;
    private boolean pulp;

    public Juice(String name, String size, boolean hasPulp) {
        super(name, size);
        ingredients = new ArrayList<>();
        setHasPulp(pulp);
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient){
        List<String> expIngredients = Arrays.asList("apple", "orange", "strawberry", "pineapple", "banana", "lemon");
        if(expIngredients.contains(ingredient.toLowerCase()))
            ingredients.add(ingredient);
        else
            throw new IllegalArgumentException("You must choose from " + expIngredients);

    }

    public boolean hasPulp() {
        return pulp;
    }

    public void setHasPulp(boolean pulp) {
        this.pulp = pulp;
    }

    public int getNumOfIngredients(){
        return ingredients.size();
    }

    public String toString(){
        return String.format("%s, size: %s, %d ingredients", getName(), getSize(), getNumOfIngredients());
    }

}
