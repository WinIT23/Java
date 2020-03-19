/*
 *  W.A.P. with multiple main in diffrent classes in same program 
 */

//public class Abc {
class Abc {
    public void Display() {
        System.out.println("Hello World....");
    }
    public static void main(String[] args) {
        Abc ob = new Abc();
        ob.Display();
    }
}

//class AbcDemo {
public class AbcDemo_2 {
    public static void main(String[] args) {
        Abc ob = new Abc();
        String args1[] = new String[3];
        args1[0] = "Hello";
        args1[1] = "World";
        ob.main(args1);
        ob.Display();
    }
}
