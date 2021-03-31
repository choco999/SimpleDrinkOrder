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
        if(numOfSugar <= 4 && numOfSugar >= 0)
            this.numOfSugar = numOfSugar;
        else
            throw new IllegalArgumentException("The number of sugar must be 0 - 4");
    }

    public int getNumOfCream() {
        return numOfCream;
    }

    public void setNumOfCream(int numOfCream) {
        if(numOfCream <= 4 && numOfCream >= 0)
            this.numOfCream = numOfCream;
        else
            throw new IllegalArgumentException("The number of cream must be 0 - 4");
    }

    public double getCalories(){
        int numOfSugar = getNumOfSugar();
        int numOfCream = getNumOfCream();
        int calorieOfOneSugar = 16;
        int calorieOfOneCream = 20;

        return numOfSugar * calorieOfOneSugar + numOfCream * calorieOfOneCream;
    }

//    public String getBlendName(int numOfCream,int numOfSugar){
////        String coffeeName = "";
////        if(numOfCream == 0 && numOfSugar == 0)
////            coffeeName = "Black";
////        else if(numOfCream == 1 && numOfSugar == 1)
////            coffeeName = "Regular";
////        else if(numOfCream == 2 && numOfSugar == 2)
////            coffeeName = "Double Double";
////        else if(numOfCream == 3 && numOfSugar == 3)
////            coffeeName = "Triple Triple";
////        else if(numOfCream == 4 && numOfSugar == 4)
////            coffeeName = "Four by Four";
////        else
////            coffeeName = numOfCream + " cream " + numOfSugar + " sugar";
////        return coffeeName;
////    }

    public String getBlendName(){
        int numOfCream = getNumOfCream();
        int numOfSugar = getNumOfSugar();
        String coffeeName = "";
        if(numOfCream == 0 && numOfSugar == 0)
            coffeeName = "Black";
        else if(numOfCream == 1 && numOfSugar == 1)
            coffeeName = "Regular";
        else if(numOfCream == 2 && numOfSugar == 2)
            coffeeName = "Double Double";
        else if(numOfCream == 3 && numOfSugar == 3)
            coffeeName = "Triple Triple";
        else if(numOfCream == 4 && numOfSugar == 4)
            coffeeName = "Four by Four";
        else
            coffeeName = numOfCream + " cream " + numOfSugar + " sugar";
        return coffeeName;
    }
}
