package zooAnimals;

public class Binturong extends Mammals implements makeNoise  {

//////////////////////////Attributes////////////////////////
	


/////////////////////////Constructors///////////////////////
	public Binturong(String vSpecies, String vName, int vAge, String vColour, int vWeight, String vGender) {
		super(vSpecies,);
		}
	
	public Binturong(Binturong vBinturong) {
		super(vBinturong.getSpecies(), vBinturong.name);
	}

////////////////////////Methods////////////////////////////
	
	public String toString() {
		return "This Binturong is a " + this.getSpecies()+ "they are called " + this.name;
	}
}
