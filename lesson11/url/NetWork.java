package lesson11.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetWork {

	public static String loadStringFromURL(String urlAddres, String code) throws IOException {
		String result = "";
		URL url = new URL(urlAddres);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), code))) {
			String temp = "";
			for (; (temp = br.readLine()) != null;) {
				result += temp + System.lineSeparator();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
