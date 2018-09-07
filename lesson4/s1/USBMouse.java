package lesson4.s1;

public class USBMouse implements USBDevice {
	private String model;
	private boolean inversion;

	public USBMouse(String model, boolean inversion) {
		super();
		this.model = model;
		this.inversion = inversion;
	}

	public USBMouse() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isInversion() {
		return inversion;
	}

	public void setInversion(boolean inversion) {
		this.inversion = inversion;
	}

	@Override
	public int getID() {// TODO Auto-generated method stub
		return model.hashCode();
	}

	@Override
	public String getDeviceDescription() {

		return toString();
	}

	@Override
	public void connect() {
		System.out.println("Mouse connected ...");

	}

	@Override
	public String toString() {
		return "USBMouse [model=" + model + ", inversion=" + inversion + "]";
	}

}
