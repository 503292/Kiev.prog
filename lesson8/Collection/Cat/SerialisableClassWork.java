package lesson8.Collection.Cat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialisableClassWork {
	public static void saveObjectToField(Object obj, File file) throws IllegalArgumentException, IOException {
		if (obj == null || file == null) {
			throw new IllegalArgumentException();
		}

		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {

			oos.writeObject(obj);
		} catch (IOException e) {
			throw e;
		}
	}
	
	public static Object loadObjectFromFile(File file) throws IOException, ClassNotFoundException{
		if(file == null) {
			throw new IllegalArgumentException();
		}
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))){
			return ois.readObject();
		}catch(IOException | ClassNotFoundException e) {
			throw e;
		}
		
	}

}
