import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

class Network {
    private List<String> mList;
    private IP myIP;
    private String myIPAddresString;
    
    public Network() throws UnknownHostException {
        this.mList = new ArrayList<>();
        InetAddress inetAddress = InetAddress.getLocalHost();
        this.myIPAddresString = inetAddress.getHostAddress();
        this.myIP = new IP(this.myIPAddresString); 
    }

    public List<String> getList() {
        return mList;
    }

    public IP getMyIP() throws NullPointerException {
        return myIP;
    }

    public void listHosts() throws UnknownHostException, IOException {
        final String myRange = myIP.getMyIP().toString().substring(0, myIP.getMaskBit() + 1);
        
        for(int i = 0; i < 255; i++) {
            if(InetAddress.getByName(myRange + i).isReachable(100)) {
                System.out.println(myRange + i);
                mList.add(myRange + i);
            } else {
                System.out.println(myRange + i + " NOT AVAILABLE.");
            }
        }
    } 
}

class IP {
    private StringBuffer myIP;
    private int maskBit;

    IP(String myIP) {
        this.myIP = new StringBuffer(myIP);

        int i = myIP.length() - 1;
        while(myIP.charAt(i) != '.') {
            i -= 1;
        }
        this.maskBit = i;
    }

    // isn't working as indented... Fix this or go with getHostByName approach
    public void getByteArray() {
        String[] temp = this.myIP.toString().split(".");

        System.out.println(this.myIP);
        System.out.println(this.maskBit);

        for (String b : temp) {
            System.out.println(Byte.parseByte(b));
        }
    }

    @Override
    public String toString() {
        return myIP.toString();
    }

    /**
     * @return the maskBit
     */
    public int getMaskBit() {
        return maskBit;
    }

    /**
     * @return the myIP
     */
    public StringBuffer getMyIP() {
        return myIP;
    }
}

public class NetworkDemo {
    public static void main(String[] args) {
        try {
            Network obj = new Network();
            //obj.getMyIP().getByteArray();
            obj.listHosts();

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}