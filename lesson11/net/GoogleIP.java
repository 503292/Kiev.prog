package lesson11.net;

import java.net.*;

public class GoogleIP {
	public static void main(String[] args) {
		try {
			InetAddress adress = InetAddress.getByName("www.google.com");
			System.out.println(adress);
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
	}
}