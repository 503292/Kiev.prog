package Lesson1.Task3;

public class Phone {

	private long numberP;
	private Network network;
	private boolean isRegistred;
	
	public Phone(long numberP, Network network) {
		super();
		this.numberP = numberP;
		this.network = network;
	}

	public Phone() {
		super();
	}

	public void registration() {
		isRegistred = network.addPhonNum(numberP);
	}

	public void call(long number) {
		if (isRegistred) {
			long[] baseMass = network.getBase();

			for (int i = 0; i < baseMass.length; i++) {
				if (baseMass[i] == number) {
					System.out.println("Я дзвоню на номер " + number);
				}

			}
			

		}
		
		else if(isRegistred == false) {
			
			System.out.println("Цього номера немає в базі" + number);
		}

	}

	public long getNumberP() {
		return numberP;
	}

	public void setNumberP(int numberP) {
		this.numberP = numberP;
	}

	

}
