
public class UsingGetterSetter {

	private String personName;

	//Setters and Getters allow for an object to contain private variables which can be accessed and changed with restrictions.
	public String getName() {
		if (personName.length() > 16) {
			return "Name is too Large";
		} else {
			return personName;
		}
	}

	public void setName(String name) {
		if (name != null && name.length() > 2) {
			this.personName = name;
		}
	}

	public static void main(String[] args) {
		
		UsingGetterSetter ugs=new UsingGetterSetter();
		ugs.setName("Pranay");
		System.out.println(ugs.getName());

		ugs.setName("PranaySingh9998877665544332211");
		System.out.println(ugs.getName()+" as its having "+ugs.getName().length()+" characters.");

	}

}
