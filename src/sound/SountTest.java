package sound;

public class SountTest {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());

	}
	public static void printSound(Soundable a) {
		System.out.println(a.sound());
	}

}
