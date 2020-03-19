package Lac_08_28;

//W.A.P. to demonstrate abstract class

abstract class Vegetables {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getColour();
    public abstract void setColour(String colour);

/*      This Will also Work.....
    public String toString() {
        return "This vegetable is " + this.getName() +
               ". It's colour is " + this.getColour();
    }
 */
}

class Tomato extends Vegetables {
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
        return "This vegetable is " + this.getName() +
               ". It's colour is " + this.getColour();
    }
}

class VegetableDemo {
    public static void main(String[] args) {
        Tomato t1 = new Tomato();

        t1.setName("Tomato");
        t1.setColour("Red");

        System.out.println(t1);
    }
}
