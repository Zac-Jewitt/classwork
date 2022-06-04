package assignments.controlflow;

public class ForLoopTest {
	
	public static void main(String[] args) {
		int num = 20;
		long result = 1;
		
		for(int i = 2; i <= num; i++) {
			
			result = result * i;
			
		}
		
		System.out.println("The factorial of " + num + " is: " + result);
		
	}

}
