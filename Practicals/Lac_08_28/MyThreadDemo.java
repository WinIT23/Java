package Lac_08_28;

class MyThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++)
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

class MyThreadDemo {
    public static void main(String[] args) {
        //Thread one
        new Thread(new MyThread(), "one").start();
        //Second thread..
        new Thread(new MyThread(), "twox").start();
        
        for(int i = 0; i < 100; i++)
        System.out.println(Thread.currentThread().getName() + " is running....");
    }
}
