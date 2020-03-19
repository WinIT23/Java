/*
 *******************************************************************************
 *
 *  1. If method is public in animal and not public in Dogs than it woun't
 *     override.
 *  2. If any method is abstract class must be abstract.
 *
 *******************************************************************************
 */


abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dogs extends Animal {
    void sleep() {
        System.out.println("I sleep with my Hooman...");
    }
    void eat() {
        System.out.println("I eat everything except Choclate. It does me a sick.");
        sleep();
    }
}

class Demo {
    public static void main(String[] args) {
        Animal obj = new Dogs();
        obj.eat();
    }
}
