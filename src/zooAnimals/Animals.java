package zooAnimals;


public abstract class Animals {
	
	//////////////////////////Attributes////////////////////////
	String name;
	int age;
	String colour;
	int weight;
	String gender;
	
	
	
	
	/////////////////////////Constructors///////////////////////
		public Animals(String vName, int vAge, String vColour, int vWeight, String vGender) {
		this.name = vName;
		this.age = vAge;
		this.colour = vColour;
		this.weight = vWeight;
		this.gender = vGender;
		
				
	}

		
	
	
	////////////////////////Methods////////////////////////////
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getColour() {
		return colour;
	}




	public void setColour(String colour) {
		this.colour = colour;
	}




	public int getWeight() {
		return weight;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	

}
