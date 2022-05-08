package day27;

 class  Sampleton{
/*
 * 1.constructor should be private
 * 2.creat static ref variable of the class 
 * 3.creat static method which return current class object
 */
	//1.constructor should be private
	private Sampleton() {
		System.out.println("Sampleton class cons");
	}
	//2.create static ref variale of the class
	
	static Sampleton singleObj=new  Sampleton();
	
	//3.creat static method which return current class object
	
	public static Sampleton getSampletonObject() {
		return singleObj;
	}
	void display() {
		System.out.println("I am display()");
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		
	//Sampleton s1=new Sampleton();//error as Sampleton is asingleton class
		Sampleton.getSampletonObject().display();  //or
		Sampleton s2=Sampleton.getSampletonObject();//indirect meaning---->Sampleton.getInstance()--->singleObj---->new Sampleton()
		s2.display();
	}

}
