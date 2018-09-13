package lesson5.IO.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	private File source;
	private File distination;
	private MyFileFilter mFF;
	

	public FileCopy(String source, String distination, String... mFF) {
		super();
		this.source = new File(source);
		this.distination = new File(distination);
		this.mFF = new MyFileFilter(mFF);
	}

	public FileCopy() {
		super();
		this.source = new File("Folder1");
		this.distination = new File("Folder2");
		
		this.mFF = new MyFileFilter("doc");
	}

	public File getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = new File(source);
	}

	public File getDistination() {
		return distination;
	}

	public void setDistination(String distination) {
		this.distination = new File(distination);
	}

	public MyFileFilter getmFF() {
		return mFF;
	}

	public void setmFF(String mFF) {
		this.mFF = new MyFileFilter(mFF);
	}

	public void copy() throws IOException {

		String path = distination.getPath();

		File[] fileList = source.listFiles(mFF);

		for (File file : fileList) {

			Files.copy(file.toPath(), (new File(path + "//" + file.getName())).toPath(),
					StandardCopyOption.REPLACE_EXISTING);

		}
	}

}
