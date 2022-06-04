package assignments.stringmanipulations;

public class Assignment1 {

	public static void main(String[] args) {
		String input = "computer";
		String output = "";
		
		for(int i = input.length() - 1; i >= 0; i--) {
			
			output += input.charAt(i);
			
			if(i > 0) {
				output += "-";
			}

		}
		
		System.out.println(output);
	}
	
}
