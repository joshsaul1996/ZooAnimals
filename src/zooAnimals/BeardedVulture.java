package zooAnimals;

public class BeardedVulture extends Bird implements makeNoise{
	
//////////////////////////Attributes////////////////////////
	
	

/////////////////////////Constructors///////////////////////

	public BeardedVulture(String vSpecies, int vWingspan, String vName, int vAge, String vColour, int vWeight, String vGender, String vUsesTools) {
		super(vSpecies, vWingspan, vName, vAge, vColour, vWeight, vGender);
		}
	
	public BeardedVulture(BeardedVulture vBeardedVulture) {
		super(vBeardedVulture.getSpecies(), vBeardedVulture.name);
	}



////////////////////////Methods////////////////////////////

	
	
	public String toString() {
		return "This Bearded Vulture is a " + this.getSpecies()+ "they are called " + this.name;
	}
}
