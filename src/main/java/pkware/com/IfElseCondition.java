package pkware.com;

public class IfElseCondition {

	public static void main(String[] args) {
		int age=23;
		if(age<18) {
			System.out.println("Child");
		}
		else if(age<40 && age>=18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}

	}

}
