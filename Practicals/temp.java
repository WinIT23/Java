class Abc {
    boolean a;
    char abc;
    String in;
    void Displaya() {
        System.out.println(a);
    }
    void Displayabc() {
        System.out.println(abc);
        System.out.println(in);
    }
}

class Demo {
    public static void main(String[] args) {
        Abc ob = new Abc();
        ob.Displaya();
        ob.Displayabc();
    }
}
