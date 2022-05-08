package day17.This;

class Student {
	int rollno;
	float fee;
	
	Student(int rollno,float fee) {   //rollno=101,  fee=5000.0
		rollno= rollno;
		fee = fee;
		
	}
	void display() {
		System.out.println(rollno +  "  " +  fee);
	}
}
 class ThisKeyword1 {
public static void main(String[] args) {
		Student s1 = new Student(101,5000f);
		Student s2 = new Student (102,6000f);
		s1.display();
		s2.display();
	}

}

 /*
  * this keyword:
  *         - Its an Instance of an current class
  *         - its use to diffirenticate non-static global and Local variable when they have same name
  *          - can be use to call non-static members of the class
  */
 
 