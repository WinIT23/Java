import java.util.Scanner;
import java.util.Vector;
import java.net.InetAddress;    

public class NetworkDemo {

    private static Vector<String> mAvailableDevices = new Vector<>();
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String myIP = scanner.nextLine();

            // It will mask the last 8 bits of IP
            // ie. 192.168.56.105 -> 192.168.56.
            String myRange = trimIP(myIP);
            System.out.println(myRange);

            //checks whole range if any device is connected
            for(int i = 1; i < 255; i++) {
                try {
                    InetAddress addrIP = InetAddress.getByName(myRange + i);

                    if(addrIP.isReachable(1000)) {
                        mAvailableDevices.add(myRange + i);
                        System.out.println(myRange + i + " is Available.");
                    } else {
                        System.out.println(myRange + i + " is not available.");
                    }
                    
                } catch(Exception ex){} 
            }

            System.out.println("________________________________________________________________________________________");
            System.out.println(mAvailableDevices);
            System.out.println("________________________________________________________________________________________");
        }
    }

    public static String trimIP(String string) {
        int i = string.length() - 1;
        while(string.charAt(i) != '.') {
            i -= 1;
        }
        return string.substring(0, i + 1);
    }

}