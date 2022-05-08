package day4.LocalGlobalVariable;

public class NonStaticVariable2 {
   //Global Variable
	int mobileNum=123;//non-static Global Variable
	char grade;
	public static void main(String[] args) {
		System.out.println("Program Starts..........");
		//Create an object
		System.out.println("*******************r1 object*******************************");
		NonStaticVariable2 r1=new NonStaticVariable2();
		System.out.println("mobilenum with r1 reference: "+r1.mobileNum);
		
		System.out.println("grade with r1 reference: "+r1.grade);
		
		System.out.println("*********************x1 object*******************************");
		NonStaticVariable2 x1=new NonStaticVariable2();
		System.out.println("mobilenum with x1 reference: "+x1.mobileNum);
		System.out.println("grade with x1 reference: "+x1.grade);
		System.out.println("*************************Updated x1 object Variables*******************************");
		x1.mobileNum=987;
		x1.grade='A';
		System.out.println("updated,  mobilenum with x1 reference: "+ x1.mobileNum);
		System.out.println("updated, grade with x1 reference: "+x1.grade);
		System.out.println("**********************r1 object********************************");
		System.out.println("mobilenum with r1 reference: "+r1.mobileNum);
		System.out.println("grade with r1 reference:  "+r1.grade);
		System.out.println("Program Ends................");
		
	}

}
