import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class NumAddSortDemo {
    static int  MAX_RANGE = 1000000;
    static int length;
    static int count; // count number of elements added
    static ArrayList<Integer> mArray = new ArrayList<>();

    public static void main(String[] args) {
        new Thread(new NumAdd(mArray)).start();
        new Thread(new NumSort(mArray)).start();
    }

    public static ArrayList<Integer> getArrayList() {
        return mArray;
    }

    public static void setArrayList(ArrayList<Integer> arr) {
        mArray = arr;
    }
}

class NumAdd implements Runnable {
    private final ArrayList<Integer> array;
    
    NumAdd(ArrayList<Integer> array) {
        this.array = array;
    }

    @Override
    public void run() {     // Add
        Random rand = new Random();
        while(true) {
            synchronized(array) {
                try{
                    NumAddSortDemo.count += 1;
                    array.add(rand.nextInt(NumAddSortDemo.MAX_RANGE));
                    while(NumAddSortDemo.count > NumAddSortDemo.length) {
                        array.notifyAll();
                        array.wait();
                    }
                    Thread.sleep(10);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class NumSort implements Runnable {
    private final ArrayList<Integer> array;
    
    NumSort(ArrayList<Integer> array) {
        this.array = array;
    }

    @Override
    public void run() { // Sort
        while(true) {
            synchronized(array) {
                try {
                    while(NumAddSortDemo.count <= NumAddSortDemo.length) {
                        array.notifyAll();
                        array.wait();
                    }
                    Collections.sort(array);
                    System.out.print(NumAddSortDemo.count + " > " + NumAddSortDemo.length + "\n");
                    NumAddSortDemo.count = 0;
                    NumAddSortDemo.length = array.size();
                    System.out.println(array);
                    Thread.sleep(10);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
