package models;

public class Coffee extends Drink {

    private boolean hot, decaf;
    private int numOfSugar, numOfCream;

    public Coffee(String name, int size, boolean hot, boolean decaf, int numOfSugar, int numOfCream) {
        super(name, size);
        setHot(hot);
        setDecaf(decaf);
        setNumOfSugar(numOfSugar);
        setNumOfCream(numOfCream);
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public boolean isDecaf() {
        return decaf;
    }

    public void setDecaf(boolean decaf) {
        this.decaf = decaf;
    }

    public int getNumOfSugar() {
        return numOfSugar;
    }

    public void setNumOfSugar(int numOfSugar) {
        if(numOfSugar <= 6 && numOfSugar >= 0)
            this.numOfSugar = numOfSugar;
        else
            throw new IllegalArgumentException("The number of sugar must be 0 - 6");
    }

    public int getNumOfCream() {
        return numOfCream;
    }

    public void setNumOfCream(int numOfCream) {
        if(numOfCream <= 6 && numOfCream >= 0)
            this.numOfCream = numOfCream;
        else
            throw new IllegalArgumentException("The number of cream must be 0 - 6");
    }
}
