package lesson4.s1;

public class USBFlash implements USBDevice, Comparable {

	private int size;
	private String model;

	public USBFlash(int size, String model) {
		super();
		this.size = size;
		this.model = model;
	}

	public USBFlash() {
		super();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "USBFlash [size=" + size + ", model=" + model + "]";
	}

	@Override
	public int getID() {
		
		return hashCode();
	}

	@Override
	public String getDeviceDescription() {
		
		return toString();
	}
	

	@Override
	public int compareTo(Object o) {
		
		USBFlash anotheDrive = (USBFlash) o;
		
		if(this.size > anotheDrive.size) {
			return 1;
		}
		if(this.size < anotheDrive.size) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public void connect() {
		System.out.println("USBFlash connected");

	}

}
