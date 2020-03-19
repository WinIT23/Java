//Write a java program to create a class called FileWatcher that can be given
//several filenames that may or may not exist. The class should start a thread for each file name. Each thread will periodically check the existence of thefile and write the message on the screen and end.

import java.util.*;
import java.io.*;
class Assignment3_1 {
    public static void main(String[] args) {
        try{
        final BufferedReader br1=new BufferedReader(new FileReader("student.txt"));
         Thread t1=new Thread(){
             public void run()
             {
              synchronized(br1)
              {
                  try{
                      System.out.println("got the file");
                  Thread.sleep(1000);
                  }catch(Exception e1)
                  {
                      System.out.println(e1.getMessage());
                  }
              }
             }
         };
         t1.start();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            br1.close();
        }
        
try{
        final BufferedReader br1=new BufferedReader(new FileReader("student2.txt"));
         Thread t2=new Thread(){
             public void run()
             {
              synchronized(br1)
              {
                  try{
                      System.out.println("got the file");
                  Thread.sleep(1000);
                  }catch(Exception e1)
                  {
                      System.out.println(e1.getMessage());
                  }
              }
             }
         };
         t2.start();
         br1.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
