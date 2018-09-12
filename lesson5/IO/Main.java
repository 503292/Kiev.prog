package lesson5.IO;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {


		File fileIn = new File("a.txt");
		File fileOut = new File(fileIn.getName());
		
		try {
			StreamWork.fileToFileCopy(fileIn, fileOut);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
