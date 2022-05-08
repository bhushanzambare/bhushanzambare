package day4.LocalGlobalVariable;

public class FinalVariable2 {

	public static void main(String[] args) {
		
		
		//area=pi*r*r;
		int r=25;
		final double pi;//as pi is a local variable hence its value can be initiliaze before use as well
		System.out.println("Radius is: "+r);
		pi=3.14;
				double area =pi*r*r;
		System.out.println("Area of circle is: "+area);

	}

}
