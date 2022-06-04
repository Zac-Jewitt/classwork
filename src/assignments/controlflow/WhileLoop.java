package assignments.controlflow;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 568865;
		
		int original = num;
		int reversed = 0;
		int remainer = 0;
		
		
		while(num > 0) {
			
			remainer = num % 10;
			
			reversed = reversed * 10 + remainer;
			
			num = num / 10;
			
		}
		
		if(original == reversed) {
			
			System.out.println(original + " is a palindrome.");
			
		}
		else {
			
			System.out.println(original + " is not a palindrome.");
			
		}

	}

}
