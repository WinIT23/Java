// int... vs. int -> int Wins
class Abc {
/*
    void functionOne(Integer i) {
        System.out.println("Integer : " + i);
    }
*/
    void functionOne(int i) {
        System.out.println("Int : " + i);
    }

    void functionOne(int... j) {
    for(int i = 0; i < j.length; i++)
        System.out.println("Int... : " + j[i]);
}

/*
    void functionOne(long i) {
        System.out.println("Long : " + i);
    }
*/
}

class DemoAbc {
    public static void main(String... args) {

         Abc obj = new Abc();
/*        Integer i = new Integer(5);
 *        int j = 5;
 *        long k = 15;
*/
        obj.functionOne(10,20);
//        obj.functionOne(j);
//        obj.functionOne(i);
//        obj.functionOne(k);
    }
}
