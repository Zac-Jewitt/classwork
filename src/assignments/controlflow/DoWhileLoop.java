package assignments.controlflow;

public class DoWhileLoop {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int counter = 10;
		
		
		do {
			
			System.out.println(num1);
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
					
			counter--;
			
		} while(counter > 0);
		
	}

}
