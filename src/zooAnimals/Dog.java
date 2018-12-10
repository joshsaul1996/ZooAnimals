package zooAnimals;

public class Dog extends Mammals implements makeNoise {
//////////////////////////Attributes////////////////////////
	String breed;


/////////////////////////Constructors///////////////////////
	
	public Dog(String vSpecies, String vName, int vAge, String vColour, int vWeight, String vGender, String vBreed) {
		super(vSpecies);
		this.breed = vBreed;
		}
	
	public Dog(Dog vDog) {
		super(vDog.getSpecies(), vDog.name);
	}


////////////////////////Methods////////////////////////////

	public String toString() {
		return "This Dog is a " + this.getSpecies()+ "they are called " + this.name;
	}
}
