package day29Casting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		int salary = 30000;
		/* explicit windening */
		double salaryDouble = (double) salary;
		float salaryFloat = (float) salary;
		System.out.println("*************explicit widening********************");
		System.out.println("salary: " + salary + "\nsalaryDouble: " + salaryDouble + "\nsalaryFloat: " + salaryFloat);
		System.out.println("*************implicit widening****************");
		/* implicit widening or auto-widening */
		double salaryDouble2 = salary;
		float salaryFloat2 = salary;
		System.out
				.println("salary: " + salary + "\nsalaryDuble2: " + salaryDouble2 + "\nsalaryFloat2: " + salaryFloat2);

		double salaryDb = 30000.35d;
		/* explicit narrowing */
		int salaryInt = (int) salaryDb;
		float salaryFt = (float) salaryDb;
		System.out.println("**************explicit narrowing****************");
		System.out.println("salaryDb: " + salaryDb + "\nsalaryInt: " + salaryInt + "\nsalaryFt: " + salaryFt);
		/* implicit narrowing not possible */
//		int salaryInt2=salaryDb;
//		float salaryFt=salaryDb;

	}

}
