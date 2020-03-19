import java.net.*;
import java.io.*;

public class TCPClientDemo {
    public static void main(String[] args) {
        try(Socket sc = new Socket("localhost", 8888);
            InputStream is = sc.getInputStream(); ){
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
                String str; 
                while ((str = br.readLine()) != null ) {
                    System.out.println("Msg : " + str);
                }   
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}