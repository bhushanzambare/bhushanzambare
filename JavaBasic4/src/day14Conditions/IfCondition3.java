package day14Conditions;

public class IfCondition3 {

	public static void main(String[] args) {
		// Ceeating two Variables for age and weight
		int age = 17;
		int weight = 51;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are noy eligible to donate blood,as you weight is below 50");
			}
		} else {
			System.out.println("Your not eligble to donate blood,as you age is below 18");
		}

	}

}
