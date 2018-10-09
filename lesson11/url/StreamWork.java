package lesson11.url;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamWork {

	public static void streamCopy(InputStream is, OutputStream os) throws IOException {
		byte[] buffer = new byte[1024 * 1024];
		int byteRead = 0;
		for (; (byteRead = is.read(buffer)) > 0;) {
			os.write(buffer, 0, byteRead);
		}

	}

	// Звідки брати і куда писати
	public static void fileToFileCopy(File fileIn, File fileOut) throws IOException {
		if (fileIn == null || fileOut == null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
			streamCopy(is, os);

		} catch (IOException e) {
			throw e;
		}
	}
}
