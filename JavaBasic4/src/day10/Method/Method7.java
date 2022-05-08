package day10.Method;

public class Method7 {

	public static void main(String[] args) {

		System.out.println("Program Starts..........");
		Method7 m1=new Method7();
		double res=m1.getIntrest(250000,5.6,60);
		System.out.println("Intrest: "+res);
		System.out.println("Intrest1: "+m1.getIntrest1(350000,6.9,72));
		m1.getIntrest2(550000,7.5,48);
		System.out.println("Program Ends...........");
		
	}
	public double getIntrest(int p,double r,int t) {
		return(p*r*t)/100;
	}
	//or
	private double getIntrest1(int p,double r,int t) {
		double res=(p*r*t)/100;
		return res;
	}
	//or
	void getIntrest2(int p,double r,int t) {
		double res=(p*r*t)/100;
		System.out.println("Intrest is: "+res);
		
	}

}
