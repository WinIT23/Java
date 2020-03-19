import java.io.*;
import java.net.*;

public class TCPServerDemo {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(8888);
                Socket s = ss.accept();
                PrintStream ps = new PrintStream(s.getOutputStream());) {

                    String str = "Krinit";
                    ps.println(str);

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}