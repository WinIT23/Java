//obj of abstract class can be created but they can't be instantiate..
abstract class Animal {
    abstract void eat();
    void sleep() {
        System.out.println("No one gives a shit.");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("I eat a lot...");
    }
    void sleep() {
        System.out.println("I wake up before my hooman..");
    }
    void boop() {
        System.out.println("Boop Boop..");
    }

}

class Demo {
    public static void main(String args[]) {
//        Animal obj1;
        Animal obj = new Dog();
        obj.eat();
        obj.sleep();
//        obj.boop();
    }
}
