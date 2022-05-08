package day4.LocalGlobalVariable;

public class Method4 {

	public static void main(String[] args) {
		
		double sum=getAdditionResult(25,30);
		System.out.println("Addition is :"+sum);
		
        sum=getAdditionResult(56.56,30);
        System.out.println("Addition is :"+sum);
        
	   sum=getAdditionResult(896.25,56.45);
	   System.out.println("Addition is :"+sum);
	   
	   System.out.println("==================================================");
	   
	Method4.getAdditionResult2(98,42);
	System.out.println("****************printing method return value directly using print**********************************************************");
	System.out.println(getAdditionResult(55,45));
	System.out.println(Method4.getAdditionResult(87,23));
	
	double res=Method4.getAdditionResult(55,45);
	res=res*100;
	System.out.println("New result: "+res);
	
	}

	static double getAdditionResult(double num1,double num2) {
		double res=num1+num2;
		return res;
	}
	
	static void getAdditionResult2(double num1,double num2) {
		double res=num1+num2;
		System.out.println("Addition result:"+res);
	}
	
	
	
	
	
	
	
}
