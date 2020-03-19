package Lac_08_27;

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.print("<");
        for(int i = 1; i < 10; i++) {
            System.out.print("=>");

            for(int j = i*10; j <= (i+1) * 10; j++) {
                System.out.print(j + "%");

                if(j < 10) System.out.print("\b\b");
                else if(j < 100) System.out.print("\b\b\b");

                try{
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.print("\b");
        }
    }
}

class MyThreadDemo {
    public static void main(String[] args) {
        new Thread(new MyThread(),"Loading").start();
    }
}
