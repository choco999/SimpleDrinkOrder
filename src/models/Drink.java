package models;

public class Drink {
    private String name;
    private int size;

    public Drink(String name, int size) {
        setName(name);
        setSize(size);
    }

    public double getCost(){
        if(getSize() == 1){
            return 2.5;
        }
        else if(getSize() == 2){
            return 3.5;
        } else if(getSize() == 3){
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size == 1 || size == 2 || size == 3)
            this.size = size;
        else
            throw new IllegalArgumentException("Size must be 1, 2, or 3");
    }

    public String getSizeName(int size){
        String sizeName = "";
        switch(size){
            case 1:
                sizeName = "small";
                break;
            case 2:
                sizeName = "medium";
                break;
            case 3:
                sizeName = "large";
                break;
        }
        return sizeName;
    }

    public String toString(){
        return String.format("%s, size: %s", name, getSizeName(size));
    }
}
