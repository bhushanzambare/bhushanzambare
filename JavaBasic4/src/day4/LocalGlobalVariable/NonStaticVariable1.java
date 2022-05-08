package day4.LocalGlobalVariable;

public class NonStaticVariable1 {
   //Global Variable
	int mobileNum=123;//Non-Static Global Variable
	public static void main(String[] args) {
		System.out.println("Program Starts.........");
		//Creating instance/object of a class
		//NonStaticVariable1 ref;//no object created at this line,its just like avariable name
	//ref=new NonStaticVariable1();//object created
		          //or
		NonStaticVariable1 ref =new NonStaticVariable1();
		System.out.println("1st ref, Updated NonStatic Global Variable: "+ref.mobileNum);//123
		ref.mobileNum=456;
		System.out.println("1st ref,Updated NonStatic Global Vrriable: "+ref.mobileNum);//456
		//2nd instance/object creation
		NonStaticVariable1 ref1 =new NonStaticVariable1();
		System.out.println("2nd ref,NonStatic Global Variable: "+ref1.mobileNum);//123
		System.out.println("program Ends.........");
	
		
	}

}
