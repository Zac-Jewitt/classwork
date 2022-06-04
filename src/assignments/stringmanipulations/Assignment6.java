package assignments.stringmanipulations;

public class Assignment6 {

	public static void main(String[] args) {
		String input = "Softra Services Limited";
		String output = "";
		int counter = 0;
		
		input = input.trim();
		
		while(input.contains(" ")) {
			
			output += input.charAt(counter);
			
			input = input.substring((input.indexOf(" ") + 1), input.length());
			counter++;
		}
		
		output += input.charAt(counter);
		
		System.out.println(output.toUpperCase());
		
	}

}
