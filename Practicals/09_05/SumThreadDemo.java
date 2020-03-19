public class SumThreadDemo {
    public static final String THREAD_1 = "1";
    public static final String THREAD_2 = "2";
    public static final String THREAD_3 = "3";
    public static int MAX_NUMBER = 11;
    public static int sum = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new SumNumber(), THREAD_1);
        Thread t2 = new Thread(new SumNumber(), THREAD_2);
        Thread t3 = new Thread(new SumNumber(), THREAD_3);

        try {
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sum is : " + sum);
    }
}

class SumNumber implements Runnable {
    static int i = 1;
    private static int even = 0;
    private static int odd = 0;
    public void run() {
        while(i <= SumThreadDemo.MAX_NUMBER) {
            if(Thread.currentThread().getName().equals(SumThreadDemo.THREAD_1) && (i%2 == 0)) {
                even += i;
                System.out.println("E : " + even);
                i++;
            }
            else if(Thread.currentThread().getName().equals(SumThreadDemo.THREAD_2) && (i%2 == 1)) {
                odd += i;
                System.out.println("O : " + odd);
                i++;
            }
            //else if(Thread.currentThread().getName().equals(SumThreadDemo.THREAD_3)) {
                SumThreadDemo.sum = SumNumber.odd + SumNumber.even;
            //    System.out.println("Answer : " + SumThreadDemo.sum);
            //}
        }
    }
}
