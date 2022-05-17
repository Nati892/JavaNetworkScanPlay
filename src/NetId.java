import java.util.ArrayList;

public class NetId {

    //Ipv4 only
    private String IpAddress;
    private String HostName;
    private ArrayList<String> openPorts;

    public NetId(String ipAddress, String hostName) {
        IpAddress = ipAddress;
        HostName = hostName;
        this.openPorts = new ArrayList<>();
    }

    public void addOpenPort(String port) {
        if (!this.openPorts.contains(port)) this.openPorts.add(port);
    }

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    public ArrayList<String> getOpenPorts() {
        return openPorts;
    }

    public void setOpenPorts(ArrayList<String> openPorts) {
        this.openPorts = openPorts;
    }
}
