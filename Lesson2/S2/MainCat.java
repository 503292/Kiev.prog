package Lesson2.S2;

public class MainCat {

	public static void main(String[] args) {

		
		Animal inim = new Animal(3, 4, true, "milk");
		Cat one = new Cat(5, 7, true, "Milk", "Vaska", "HomeCat");
		System.out.println(one.getAge());
		
		one.getVoice();
		
		System.out.println(one);
		
		
		Animal[] zoo = new Animal[10];
		
		zoo[0] = one;

		zoo[0].getVoice();
		
		Animal an = one;
		
		zoo[1] = an;

		zoo[1].getVoice();
		
		//an.getVoice();
		
		
	}
	
	
	
	public static void voice(Animal a) {
		a.getVoice();
	}
	
	
}
