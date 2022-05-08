package day4.LocalGlobalVariable;

public class FinalVariable4 {
/*as pi is aglobal variable*/
	static double pi;
	public static void main(String[] args) {
		
		//area=pi*r*r;
		int r=25;
		pi=3.14;
		System.out.println("Radius is: "+r);
		double area=pi*r*r;
		System.out.println("area of circle is: "+area);
		

	}

}
