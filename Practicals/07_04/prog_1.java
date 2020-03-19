// boxing vs.Widening --> Widning Wins
class Abc {

    void functionOne(Integer i) {
        System.out.println("Integer : " + i);
    }
/*
        void functionOne(int i) {
        System.out.println("Int : " + i);
    }
*/
    void functionOne(long i) {
        System.out.println("Long : " + i);
    }

}

class DemoAbc {
    public static void main(String... args) {
/*
 *
 *        Integer i = new Integer(5);
 *
 *        long k = 15;
*/
        Abc obj = new Abc();
        int i = 5;
        obj.functionOne(i);
//        obj.functionOne(j);
//        obj.functionOne(i);
//        obj.functionOne(k);
    }
}
