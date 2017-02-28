package Corejava;

import java.net.InetAddress;

public class GetMyIPaddress {
	public static void main(String[] args) throws Exception{
		
		InetAddress myIP = InetAddress.getLocalHost();
		System.out.println("My IP address is :");
		System.out.println(myIP.getHostAddress());
		
	}

}
