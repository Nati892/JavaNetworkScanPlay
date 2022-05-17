import java.net.*;
import java.util.Iterator;

public class NetworkHandler {


    public NetId getLocalNetId() {
        NetId result = null;
        try {
            Iterator<NetworkInterface> iterator = NetworkInterface.getNetworkInterfaces().asIterator();
            while (iterator.hasNext()) {
                NetworkInterface networkInterface = iterator.next();//got network interface

                //now loop through interface's ip address
                Iterator<InetAddress> iterator1 = networkInterface.getInetAddresses().asIterator();
                while (iterator1.hasNext()) {
                    InetAddress currInet = iterator1.next();
                    if (currInet instanceof Inet4Address) {
                        String ipAdd = currInet.toString().substring(1);
                        if (!ipAdd.equals("127.0.0.1")) {
                            result=new NetId(ipAdd, InetAddress.getLocalHost().getHostName());
                        }
                    }
                }

            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return result;
    }


}
