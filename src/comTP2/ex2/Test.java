package comTP2.ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress pc;
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(InetAddress.getByName("XPSvanMohamed").getHostAddress());

    }
}
