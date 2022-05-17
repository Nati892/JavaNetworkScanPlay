
import java.net.*;
import java.util.Iterator;
import java.util.Scanner;

public class NetScanner {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        NetworkHandler handler = new NetworkHandler();
        NetId local = handler.getLocalNetId();
        if (local != null) {
            System.out.println("Name: "+ local.getHostName());
            System.out.println("Address: "+ local.getIpAddress());
        } else {
            System.out.println("No local host found");
        }

    }


}
