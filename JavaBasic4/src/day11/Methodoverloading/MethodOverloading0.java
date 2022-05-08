package day11.Methodoverloading;

public class MethodOverloading0 {

	public static void main( ) {
		System.out.println("I am main().....");
	}
	public static void main(String[] args) {
		main();

		System.out.println("Sum1: "+addNumbers());
		System.out.println("Sum2: "+MethodOverloading0.addNumbers(45,55));
		System.out.println("Sum3: "+MethodOverloading0.addNumbers(47,53,58));
		System.out.println("Sum4: "+MethodOverloading0.addNumbers(47,53.56,58));
		
	}
    static int addNumbers() {
    	System.out.println("***********addNumbers() started*********************");
    	int num1=10,num2=20;
		System.out.println("************addNumbers() befors return*******************888");
        return num1+num2;
		
    }
	static int addNumbers(int num1, int num2) {
		System.out.println("**********addNumbers() started*************************");
		
		System.out.println("***********addNumbers() before return*****************************");
		return num1+num2;
		
	}
	static int addNumbers(int num1,int num2,int num3) {
		System.out.println("************addNumbers() started************************");
	    System.out.println("**********adddNumbers() before return*******************");
	    return num2+num2;
	    
	}
	static double addNumbers(int num1,double num2, int num3) {
		System.out.println("***********addNumbers() started**********************88");
		System.out.println("***********addNumbers() before return*************************8");
         return num1+num2;
		
	}
}
