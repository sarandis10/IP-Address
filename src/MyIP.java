import java.net.InetAddress;

public class MyIP {

	public static void main(String[] args) throws Exception {
		
		InetAddress myIP=InetAddress.getLocalHost();	
		
		System.out.println("my IP address is:" + myIP);

	}

}
