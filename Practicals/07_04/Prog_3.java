//Obj of Abstract can't be created
//Every abstract function MUST BE OVERRIDEN
//class can be abstract without any abstract method

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

    public static void main(String[] args) {
        Animal obj = new Dogs();
        obj.eat();
    }
}
