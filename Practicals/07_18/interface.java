interface Trying1 {
    String method();
}

interface Trying2 {
    String method();
}

class SameMethodSig implements Trying1, Trying2 {
    public String method() {
        return "See I can return some Sh*t.";
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        SameMethodSig ob = new SameMethodSig();
        System.out.println(ob.method());
    }
}
