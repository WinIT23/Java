package Lac_08_27;

class MyThread implements Runnable {
    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName());
        if(Thread.currentThread().getName().equals("1")) System.out.println("Odd");
        else if(Thread.currentThread().getName().equals("2")) System.out.println("Even");
        else System.out.println(Thread.currentThread().getName() + " is Running");
    }
}

class MyThreadDemo {
    public static void main(String[] args) {
        //Thread one
        Thread t1 = new Thread(new MyThread(),"1");
        t1.start();
        //Second thread
        Thread t2 = new Thread(new MyThread(),"2");
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
//        System.out.println(main.getState()); // dosen't work...... gives error
    }
}
