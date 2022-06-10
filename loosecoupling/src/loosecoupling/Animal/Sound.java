package loosecoupling.Animal;

public class Sound {
	Animal animal;
	
	Sound(Animal animal){ 
		this.animal=animal;
	}
	void getSound(){
		animal.sound();
	}
}
