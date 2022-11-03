
public class SoundableExample {
	
	private static void printSound(Soundable soundable)
	{
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		Soundable catSound = new Cat();
		Soundable dogSound = new Dog();
		
		printSound(catSound);
		printSound(dogSound);
	}

}
