/*
 *  W.A.P. to demonstrate Overloading main function...
 */

//public class Abc {
class Abc {
    public void Display() {
        System.out.println("Hello World....");
    }
    public static void main(int args) {
        Abc ob = new Abc();
        ob.Display();
    }
}

//class AbcDemo {
public class AbcDemo {
    public static void main(String[] args) {
        Abc ob = new Abc();
        ob.Display();
        ob.main(12);
    }
}
