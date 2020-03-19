class VarTest {
    static int var;
    VarTest(int x) {
        var = x;
    }
    void setvat(int x) {
        var = x;
    }
    static void display() {
        System.out.println(var);
    }
}

class One {
    public static void main(String[] args) {
        VarTest obj = new VarTest(10);
        VarTest.display();
    }
}
