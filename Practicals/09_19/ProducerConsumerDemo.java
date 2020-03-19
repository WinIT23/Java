import java.util.ArrayList;

class Producer implements Runnable {
    private final ArrayList<Integer> taskObject;
    private final int MAX_SIZE;
    
    Producer(ArrayList<Integer> taskObject, int size) {
        this.taskObject = taskObject;
        this.MAX_SIZE = size; 
    }
    
    @Override
    public void run() {
        int counter = 0;
        while(true) {
            try{
                produce(counter++);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void produce(int item) throws Exception {
        synchronized(taskObject) {
            while(taskObject.size() == MAX_SIZE) {
                System.out.println("Waiting for Notify...");
                taskObject.wait();
            }   
            Thread.sleep(1000);
            taskObject.add(item);
            System.out.println("Produced : " + item);
            taskObject.notify();                
        }
    }
}


class Consumer implements Runnable{
    private final ArrayList<Integer> taskObject;

    Consumer(ArrayList<Integer> taskObject) {
        this.taskObject = taskObject;
    }

    @Override 
    public void run() {
        while(true) {
            try {
                consume();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void consume() throws Exception {
        synchronized(taskObject) {
            while(taskObject.isEmpty()) {
                System.out.println("Waiting for producer to notify");
                taskObject.wait();              
            }
            Thread.sleep(1000);
            System.out.println("Consumed : " + taskObject.remove(0));
            taskObject.notify();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> taskQueue = new ArrayList<>();
        int MAX_CAPACITY = 5;
        Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
        Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
        tProducer.start();
        tConsumer.start();
    }
}

