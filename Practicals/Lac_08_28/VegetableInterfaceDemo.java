package Lac_08_28;

/*
 *******************************************************************************
 *  *   W.A.P. to impliment interface
 *  1. functions in implementing class must be public because they are public
 *     by default.
 *******************************************************************************
 */
 
interface Vegetable {
    String getName();
    void setName(String name);
    String getColour();
    void setColour(String colour);
}

class Tomato implements Vegetable {
    private String name;
    private String colour;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "It Works Bitches.....";
    }
}

class VegetableInterfaceDemo {
    public static void main(String[] args) {

        Tomato t1 = new Tomato();
        t1.setName("Raju");
        t1.setColour("Blue");

        System.out.println(t1);
    }
}
