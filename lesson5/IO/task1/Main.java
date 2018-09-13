package lesson5.IO.task1;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		String[] st = new String[] {"doc", "txt"};
		FileCopy fc = new FileCopy("Folder1","Folder2", st);
		fc.copy();
		
	
	}
}
