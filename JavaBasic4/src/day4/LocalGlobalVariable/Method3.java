package day4.LocalGlobalVariable;

public class Method3 {

	public static void main(String[] args) {
		
//		System.out.println("Hi, Good Morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 30 Years Old");
//		System.out.println("I am getting 96000");
		
//		System.out.println("Hi, Good Morning Everyone");
//		System.out.println("Staying in Pune");
//		System.out.println("I am 25 Years Old");
//		System.out.println("I am getting 56000");
		
//		System.out.println("Hi, Good Morning Everyone");
//		System.out.println("Staying In Pune");
//		System.out.println("I am 26 Years Old");
//		System.out.println("I am getting45000");
		
		printDetails(30,96000);
		printDetails(25,56000);
		printDetails(26,45000);
		
	}
	
	/*
     *access modifier:public
	 *non-access modifiers:static
     *returnType:void
     *methodname:printDetails
     * @param age
     *@param salary
     */
	
	public static void printDetails(int age,int salary) {
		System.out.println("Hi, Good Morning Everyone");
		
		System.out.println("Staying in Pune");
		System.out.println("I am "+age+" years old");
		System.out.println("I am getting "+salary);
		//return;//optional because if you dont write it then java complier will write it
		
		
		
	}
		
	}
	
	
	
	
  

	
	
	
	
	
	
	
	
	
	