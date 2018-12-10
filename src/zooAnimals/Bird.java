package zooAnimals;


public abstract class Bird extends Animals{
	
	//////////////////////////Attributes////////////////////////
	
	String species;
	int wingspan;
	
	
	/////////////////////////Constructors///////////////////////
	
	public Bird(String vSpecies, int vWingspan, String vName, int vAge, String vColour, int vWeight, String vGender) {
		super(vName, vAge, vColour, vWeight, vGender);
		this.species = vSpecies;
		this.wingspan = vWingspan;
	}

	public Bird(String vSpecies, int vWingspan, String vName, int vAge, int vWeight, String vGender) {
		this(vSpecies, vWingspan, vName, vAge, "Black", vWeight, vGender );
	}
	
	
	
	////////////////////////Methods////////////////////////////
	

	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public int getWingspan() {
		return wingspan;
	}


	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

}
