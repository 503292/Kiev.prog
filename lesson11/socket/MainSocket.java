package lesson11.socket;

import java.net.*;
import java.io.*;

public class MainSocket {
	public static void main(String[] args) {
		try (Socket socket = new Socket("google.com", 80)) {
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("GET / HTTP/1.1");
			pw.println("Host:ya.ru");
			pw.println("");
			pw.flush();
			InputStream s = socket.getInputStream();
			int r;
			for (; (r = s.read()) != -1;) {
				System.out.print((char) r);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
