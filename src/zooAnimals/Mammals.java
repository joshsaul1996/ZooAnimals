package zooAnimals;


public abstract class Mammals extends Animals{

	//////////////////////////Attributes////////////////////////
	
	private String species;
	
	
	/////////////////////////Constructors///////////////////////
	
	
	public Mammals(String vSpecies, String vName, int vAge, String vColour, int vWeight, String vGender) {
			super(vName, vAge, vColour, vWeight, vGender);
			this.species = vSpecies;
		}
	
	public Mammals(String vSpecies, String vName, int vAge, int vWeight, String vGender) {
		this(vSpecies, vName, vAge, "Black", vWeight, vGender );
	}

	
	////////////////////////Methods////////////////////////////

public String getSpecies() {
	return species;
}


public void setSpecies(String species) {
	this.species = species;
}}
	