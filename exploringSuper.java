package _30DaysOfCode;

public class exploringSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseClass child = new subClass();
		child.printMsg();

	}

}

class baseClass {
	
	void printMsg(){
		System.out.println("Hi i am a super class");
	}
}



class subClass extends baseClass{
	void printMsg() {
//		super.printMsg();
		System.out.println("Hi I am from child class");
	}
}