import java.io.*;
import java.net.*;

public class UDPServerDemo {
    public static void main(String[] args) {
        try(DatagramSocket dSocket = new DatagramSocket(8080);){
            byte[] data = new byte[65535];
            DatagramPacket dPacket = null;

            while(true) {
                dPacket = new DatagramPacket(data, data.length);
                dSocket.receive(dPacket);

                System.out.println(StringConv(data));

                data = new byte[65535];
            }
        } catch (Exception ex) {}
    }

    public static String StringConv(byte[] bData) {
        if(bData == null) 
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while(bData[i] != 0) {
            ret.append((char)bData[i]);
            i++;
        }
        return ret.toString();
    }
}