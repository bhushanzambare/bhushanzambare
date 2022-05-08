package day4.LocalGlobalVariable;

public class StaticGlobalVariable1 {

	static int mobileNumber=123;
	
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		System.out.println("SGV : "+mobileNumber);//123
		
		System.out.println("SGV with Standard: "+StaticGlobalVariable1.mobileNumber);//123
		
		System.out.println("*********************************");
		
		mobileNumber=456;        //re-initialization or updating or overriding the value of age variable
		
		System.out.println("SGV : "+mobileNumber);//456
		System.out.println("SGV with Standard : "+StaticGlobalVariable1.mobileNumber);//456
		
		System.out.println("**********************************");
		int mobileNumber=789;//
		
		System.out.println("Local Variable : "+mobileNumber);//789
		System.out.println("SGV with Standard : "+StaticGlobalVariable1.mobileNumber);//456
		
		System.out.println("Program Ends...........");

		
		

		
		

	}

}
