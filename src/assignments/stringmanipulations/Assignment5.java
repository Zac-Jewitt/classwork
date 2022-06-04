package assignments.stringmanipulations;

public class Assignment5 {

	public static void main(String[] args) {
		String input = "Softra Services Limited";
		String output = "";
		
		input = input.trim();
		
		while(input.contains(" ")) {
			
			output += input.charAt(0);
			
			input = input.substring((input.indexOf(" ") + 1), input.length());
		}
		
		output += input.charAt(0);
		
		System.out.println(output);
		
	}

}
