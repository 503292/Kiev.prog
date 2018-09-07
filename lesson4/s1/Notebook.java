package lesson4.s1;

public class Notebook {

	private String vendor;
	private String model;
	private String cpu;
	private String processor;

	public Notebook(String vendor, String model, String cpu, String processor) {
		super();
		this.vendor = vendor;
		this.model = model;
		this.cpu = cpu;
		this.processor = processor;
	}

	public Notebook() {
		super();
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Notebook [vendor=" + vendor + ", model=" + model + ", cpu=" + cpu + ", processor=" + processor + "]";
	}

	public void connectUSBDevice(USBDevice device) {
		
		System.out.println("ID = " + device.getID());
		System.out.println("Descrition  = " + device.getDeviceDescription());
		device.connect();
		
	}
	
}
