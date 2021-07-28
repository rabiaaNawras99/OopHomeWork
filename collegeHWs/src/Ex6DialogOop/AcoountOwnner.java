package Ex6DialogOop;

public class AcoountOwnner {

	//private static int count =0;
	
	
	
	
	private String name;
	private String family_name;
	private String owner_id;
	private String location;
	
	public AcoountOwnner(String name ,String family_name,String owner_id ,String location ) {
		this.name=name;
		this.family_name=family_name;
		this.owner_id=owner_id;
		this.location=location;
	}
	//getters and setters
	public String getOwnerId() {
		return owner_id;
	}

	public void OwnerId(String owner_id) {
		if(owner_id.length()<=16)
			System.out.println("INPUT ERROR !"); 
		this.owner_id = owner_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<=16)
			System.out.println("INPUT ERROR !"); 
		this.name = name;
	}

	public String getFamilyName() {
		return family_name;
	}

	public void setFamilyName(String familyName) {
		if(familyName.length()<=16)
			System.out.println("INPUT ERROR !");
		this.family_name = familyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
		
		
		public String toString() {
		
			return "Owner : "+getName() +" "+ getFamilyName() + ", "+getOwnerId() +", "+getLocation()+"\n";
			
		}

}
