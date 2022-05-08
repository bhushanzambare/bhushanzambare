package day28Encapsulation;

class Person {
	private String name;// Private=restricted access
	// Getter

	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
}

public class Encap1 {

	public static void main(String[] args) {
		Person myObj = new Person();
		// myobj.name = "John";//error
		// System.out.println(myobj.name);//error
		System.out.println(myObj.getName());
		myObj.setName("John"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName());

	}

}
