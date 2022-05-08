package Day30Poly;

class Bank {
	float getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfIntrest() {
		return 8.4f;
	}
}

class ICICI extends Bank {
	float getRateOfIntrest() {
		return 7.3f;
	}
}

class AXIS extends Bank {
	float getRateOfIntrest() {
		return 9.7f;
	}
}

public class Runtime4 {
	public static void main(String[] args) {
		Bank b = new SBI();// upcasting
		System.out.println("SBI Rate of Interest: " + b.getRateOfIntrest());//
		b = new ICICI();// up casting
		System.out.println("ICICI Rate of Interest: " + b.getRateOfIntrest());//
		b = new AXIS();// up casting
		System.out.println("AXIS Rate of Interest: " + b.getRateOfIntrest());//
	}

}
