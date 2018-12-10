package zooAnimals;

public abstract class Crow extends Bird implements makeNoise {

//////////////////////////Attributes////////////////////////
	
	public String usesTools;
	

/////////////////////////Constructors///////////////////////

	public Crow(String vUsesTools, String vSpecies, int vWingspan, String vName, int vAge, String vColour, int vWeight, String vGender) {
		super(vSpecies, vWingspan,vName, vAge, vColour,vWeight, vGender);
		this.usesTools = vUsesTools;
		}
	
	public Crow(Crow vCrow) {
		super(vCrow.getSpecies(), vCrow.getWingspan(), vCrow.name);
	}


////////////////////////Methods////////////////////////////
	
	
	public String getUsesTools() {
		return usesTools;
	}


	public void setUsesTools(String usesTools) {
		this.usesTools = usesTools;
	}
	
	public String toString() {
		return "Does the Crow use Tools? "+this.getSpecies()+". " + "There name is "+ this.name;
	}

	
	
	
}
