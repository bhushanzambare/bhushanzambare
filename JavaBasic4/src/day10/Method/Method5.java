package day10.Method;

public class Method5 {

	public static void main(String[] args) {
		/*
		 * res=(p*r*t)/100; 
		 * 
		 */

		System.out.println("Get intrest using getIntrest(): "+Method5.getIntrest(250000,6.5,60));
		System.out.println("Get intrest using getIntrest1(): "+Method5.getIntrest1(250000,6.5,60));
		Method5.getIntrest2(350000,5,36);
		System.out.println("*********************************");
		double res=Method5.getIntrest(250000,6.5,60);
		System.out.println(res);
	}
	public static double getIntrest(int p,double r,int t) {
		return (p*r*t)/100;
	}	
		//or
		public static double getIntrest1(int p,double r,int t) {
			double res=(p*r*t)/100;
			return res;
			
		}
		//or
      public static void getIntrest2(int p,double r,int t) {
    	  double res=(p*r*t)/100;
    	  
		System.out.println("Intrest is :"+res);
		
      }
		

}
