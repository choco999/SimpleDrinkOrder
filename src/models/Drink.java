package models;

import java.util.Arrays;
import java.util.List;

public class Drink {
    private String name;
    private String size;

    public Drink(String name, String size) {
        setName(name);
        setSize(size);
    }

    public double getCost(){
        if(getSize().equals("Small")){
            return 2.5;
        }
        else if(getSize().equals("Medium")){
            return 3.5;
        } else if(getSize().equals("Large")){
            return 4.5;
        } else {
            return -1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            if(Character.isUpperCase(name.charAt(0))) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("First letter must be an upper case");
            }
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        List<String> sizes = Arrays.asList("Small", "Medium", "Large");
        if(sizes.contains(size))
            this.size = size;
        else
            throw new IllegalArgumentException("Size must be Small , Medium, or Large");
    }

    // placeholder
    public String toString(){
        return "";
    }
}
