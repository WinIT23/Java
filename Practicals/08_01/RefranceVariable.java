class SuperRafrenceVariable {
    int varRef;

    public SuperRefrenceVariable methodOne(int i) {
        return new SuperRefrenceVariable();
    }
}

class RefrenceVariable extends SuperRefrenceVariable {
    int varRef;

    public RefrenceVariable methodTwo(int i) {
        return new RefrenceVariable();
    }
}

class ClassMain {
    public static void main(String[] args) {
        RefrenceVariable obj = new RefrenceVariable();
        obj.methodTwo();
    }
}
