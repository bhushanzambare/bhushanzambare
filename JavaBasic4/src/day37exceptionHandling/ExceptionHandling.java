package day37exceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("program starts from here....");
		// 1. abnormal statements
		int i = 10;
		int j = i / 0;// Arithmatic Exception
		System.out.println("res:  " + j);
		// 2.abnormal statements
		int[] empId = new int[3];
		empId[3] = 101;// ArrayIndexOutOfBoundsException
		// 3.abnormal Statements
		String str = null;
		System.out.println(str.length());// NullPointerException
		// 4.abnormal statements
		String s = "abc";
		int num = Integer.parseInt(s);// NumberFormatException
		System.out.println("num:  " + num);
		System.out.println("Program Ends here....");

	}

}
