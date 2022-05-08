package day4.LocalGlobalVariable;

public class StaticGlobalVariable3 {

	//static global variable
	static int empId;//default value
	static double salary;
	static char grade;
	static boolean isprime;
	public static void main(String[] args) {
		
		System.out.println("Program Starts.......");
		
        System.out.println("EmpId: "+empId);//0
		System.out.println("Salary : "+salary);//0.0
		System.out.println("Grade: "+grade);//
		System.out.println("Prime: "+ isprime);//false
		
		System.out.println("Program Ends.........");
		
		
	}

}
