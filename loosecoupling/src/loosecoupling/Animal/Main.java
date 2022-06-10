package loosecoupling.Animal;

public class Main {
	public static void main(String[] args) {
		Lion l=new Lion();
		Cat c=new Cat();
		Sound s=new Sound(c);
		s.getSound();
	}
}
