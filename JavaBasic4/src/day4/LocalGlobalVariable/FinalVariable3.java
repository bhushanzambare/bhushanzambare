package day4.LocalGlobalVariable;

public class FinalVariable3 {

	public static void main(String[] args) {
		
		//area=pi*r*r;
		int r=25;
		final double pi= 3.14;
		double area=pi*r*r;
		
System.out.println("Radius is: "+r+"\narea of circle is: "+area);
	}

}
