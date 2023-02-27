package exception.pkware.com;
class NegativeException extends Exception{
	@Override
	public String toString() {
		return "Radius cannot be negative";
	}
	
	@Override
	public String getMessage() {
		return "Please give a positive area";
	}
}


public class ThrowThrows {
	public static double RadiusCalculate(int r) throws NegativeException {
		if(r<0) {
			throw new NegativeException();
		}
		double result= Math.PI* r*r;
		return result;
	}
	public static int Division(int a, int b) throws ArithmeticException{
		int result=a/b;
		return result;
	}

	public static void main(String[] args) {
		try {
//			System.out.println(Division(6,0));
			System.out.println(RadiusCalculate(6));
		}
		
		catch(Exception e){
			System.out.println("It is Exception");
		}

	}

}
