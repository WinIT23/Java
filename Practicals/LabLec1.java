/*
 *  This Program is for getting better understanding of static member
 *  variables.
 */

class Abc {
    static int a;
    Abc() {
        a++;
    }
    static void Display(){
    System.out.println("The value of a :" + a);
    }
}

class Defn {
    public static void main(String[] args) {
//        Abc ob1 = new Abc();
       
        check();

//        ob1.Display();
//        System.out.println("Static variable called Directly : " + ob1.a);
        Abc.Display();

    }

    static void check() {
        System.out.println("Check Function");
    }
}
