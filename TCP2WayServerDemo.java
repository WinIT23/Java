import java.io.*;
import java.net.*;


public class TCP2WayServerDemo {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(8888);
                Socket s = ss.accept();
                PrintStream ps = new PrintStream(s.getOutputStream());
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedReader kbr = new BufferedReader(new InputStreamReader(System.in)); ){

            System.out.println("Connection Established");
            while(true) {
                String str, str1;
                
                while((str = br.readLine()) != null) {
                    System.out.println(str);
                    str1 = kbr.readLine();
                    ps.println(str1);
                }
    
            }    
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}