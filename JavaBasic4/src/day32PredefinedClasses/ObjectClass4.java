package day32PredefinedClasses;

class Print {
	int a = 10;

	public int hashcode() {
		return 101;

	}

	public String toString() {
		return "I am Print Class toString";
	}

	public boolean equals(Object obj) {
		Print p = (Print) obj;// new Print();
		return (this.a == p.a);
		// 10 == 10
	}
}

public class ObjectClass4 {

	static int last_roll = 100;
	int roll_no;

	ObjectClass4() {
		roll_no = last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		Object obj;
		ObjectClass4 s = new ObjectClass4();
		System.out.println("s:toString of ObjectClass4: " + s);// Day32String.ObjectClass4@jhuy98798
		System.out.println("s:hashcode of objectClass4: " + s.hashCode());// 68768757

		ObjectClass4 s1 = new ObjectClass4();
		System.out.println("s1: toString of ObjectClass4: " + s1);// Day32String.ObjectClass4@jhuy98798
		System.out.println("s1. hashCode of ObjectClass4: " + s1.hashCode());// 68768757
		System.out.println(s.equals(s1));// false

		Print p1 = new Print();
		System.out.println("toString of Print: " + p1);// I am Print Class toString
		System.out.println("hashCode of Print: " + p1.hashCode());// 101
		Print p2 = new Print();
		System.out.println(p1.equals(p2));//

	}

}
