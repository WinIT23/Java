import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPClientDemo {
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in);
                DatagramSocket dSocket = new DatagramSocket();){

            InetAddress ip = InetAddress.getLocalHost();
            byte[] buff = new byte[65535];
            
            while(true) {
                String input = scanner.nextLine();

                buff = input.getBytes();

                DatagramPacket dp = new DatagramPacket(buff, buff.length, ip, 8080);

                dSocket.send(dp);
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }    
    }
}