package operatorandcontrolstructure;

public class ControlStructureDemo {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		if(x > 0) {
			System.out.println("x is positive");
			if(y > 0) {
				System.out.println("y is positive");
			}
		}
		else if(x == 0) {
			System.out.println("x is zero");
		}
		else {
			System.out.println("x is negative");
		}
		
		System.out.println("--------------------------");
		
		int time = 1;
		
		switch(time) {
			case 1: {
				System.out.println("Good morning");
				break;
			}
			case 2: {
				System.out.println("Good afternoon");
				break;
			}
			case 3: {
				System.out.println("Good evening");
				break;
			}
			case 4: {
				System.out.println("Good night");
				break;
			}
			default: {
				System.out.println("There is no sun");
			}
			
		}
		
		System.out.println("-------------------------------");
		int n = 3;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 1; j <= n; j++) {
				System.out.println("hello " + i + " " + j);
			}

		}
		
		System.out.println("-------------------------------");
		
		int i = 0;
		
		while(i < 5) {
			System.out.println(i++);
		}
		
		System.out.println("-------------------------------");
		
		do {
			System.out.println(i++);
		} while(i < 5);
		
		
		
	}

}