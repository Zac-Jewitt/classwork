package assignments.controlflow;

public class BreakTest {

	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {
			
			for(int a = 2; a <= i; a++) {

				if(a == i) {
					System.out.println(i);
				}
				
				if(i % a == 0) {
					break;
				}
				
				
			}
			
		}

	}

}
