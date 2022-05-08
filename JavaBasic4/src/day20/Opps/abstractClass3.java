package day20.Opps;

abstract class RBIBank {
	abstract double getRateOfIntrestForHomeLoan();

	final void loan() {
		System.out.println("As per RBI loan..");
	}
}

class SBI101 extends RBIBank {
	double getRateOfIntrestForHomeLoan() {
		return 6.45;
	}
}

class PNB extends RBIBank {
	double getRateOfIntrestForHomeLoan() {
		return 7.5;
	}
}

class abstractClass3 {
	public static void main(String[] args) {
		PNB p1 = new PNB();
		System.out.println("PNB Rate of Interst is: " + p1.getRateOfIntrestForHomeLoan() + "%");
		p1.loan();
		SBI101 s1 = new SBI101();
		System.out.println("SBI Rate of Intrest is: " + s1.getRateOfIntrestForHomeLoan() + "%");
		s1.loan();
		RBIBank b1 = new SBI101();
		System.out.println(
				"RBI reference but object of SBI,Rate of Intrest is: " + b1.getRateOfIntrestForHomeLoan() + "%");
		RBIBank b2 = new PNB();
		System.out.println(
				"RBI reference but object of PNB,Rate of Intrest is: " + b2.getRateOfIntrestForHomeLoan() + "%");

	}

}
