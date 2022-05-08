package day20.Opps;
class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class Inheritance5 extends A2 {             
//	class Inheritance5 extends A2,B2 { //Multiply Inheritance Programe          --program aisa tha but error niklne ke liye sirf extends ke aaage A2 likha 
	Inheritance5() {
		super();//confusion
	}

	public static void main(String[] args) {
		Inheritance5 obj = new Inheritance5();
		obj.msg();
	}

}
/*Is java supports multiple inheritance or not ?
*why java doesnt support multiple inheritance using classes?
*/
