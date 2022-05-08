package day11.Methodoverloading;

public class MethodSimpleIntrest {

	public static void main(String[] args) {
		float principle = 2000, rof = 6, time = 3, intrest;

		System.out.println("Enter the Principle: " + principle);
		System.out.println("Enter the Rate of Intrest: " + rof);
		System.out.println("Enter thr time Period: " + time);

		intrest = (principle * rof * time) / 100;
		System.out.println("simple Intrest is: " + intrest);

		MethodSimpleIntrest m1 = new MethodSimpleIntrest();
		double res = m1.getIntrest(3000, 7.2, 2);
		System.out.println("MethodSimpleIntrest:" + res);

		System.out.println("SimpleIntrest: " + SimpleIntrest(250000, 6.5, 60));
	}

	public double getIntrest(float p, double r, int t) {
		double res= (p * r * t) / 100;
		return res;
	}

	public static double SimpleIntrest(int p, double r, int t) {
		double res = (p * r * t) / 100;
		return res;
	}

}