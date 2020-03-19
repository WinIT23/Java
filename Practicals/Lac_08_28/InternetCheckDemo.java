package Lac_08_28;

//Runtime is the object assosiated with JVM's current running environment
//Runtime class cannot be instantiated as it has private Runtime()..

import java.lang.Runtime;
class InternetCheck implements Runnable {
    @Override
    public void run() {
        boolean isNotAvailable = false;

        while(true) {
            try {
                Process process = Runtime.getRuntime().exec("ping www.google.com");
                if(process.waitFor() == 0) {
                    if(isNotAvailable) {
                        System.out.print("                        ");
                        System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
                    }
                    isNotAvailable = true;
                    System.out.print("Connection Available");
                    Thread.sleep(500);
                    System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
                } else {
                    System.out.print("Connection Not Available");
                    isNotAvailable = true;
                    Thread.sleep(500);
                    System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");

                }
                //Thread.currentThread().sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyClass {
    public static void main(String[] args) {
        new Thread(new InternetCheck(), "IntCheck").start();
    }
}
