package lesson5.IO.Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("newFile.txt");
			
			if(!file.exists()) {
			file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			// записувати
			pw.println("Everything is working");
			pw.println("Hello world");
			pw.close();
			
			// зчитування
			br = new BufferedReader(new FileReader("newFile.txt"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
