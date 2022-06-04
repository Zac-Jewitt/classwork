package assignments.stringmanipulations;

public class Assignment2 {

	public static void main(String[] args) {
		String input = "abcxXXcxerxxXXwer";
		String output = "";
		String x = "";
		
		for(int i = input.length() - 1; i >= 0; i--) {
			
			if(input.charAt(i) == 'x') {
				x += "x";
			}

		}
		
		output = input.replaceAll("x", "").concat(x);
		
		System.out.print(output);

	}

}
