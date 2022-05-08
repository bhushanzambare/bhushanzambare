package day4.LocalGlobalVariable;

public class FinalVariable1 {

	public static void main(String[] args) {
		
		final int empId=123;
		System.out.println("EmpId : "+empId);//123
		
		//empId=456;//error at compile time as final variable value cant be changed
		
		System.out.println("EmpId: "+empId);//456
		
		//empId=789;//
		System.out.println("EmpId :"+empId );//789
		
	//	empId=654;//
		System.out.println("EmpId :"+empId);//654
		
	}

}
