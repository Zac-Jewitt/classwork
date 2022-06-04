package assignments.stringmanipulations;

public class Assignment3 {

	public static void main(String[] args) {
		String input = "Hello World";
		String output = input;
		int length = input.length();
		
		if(length > 1) {
			output = input.charAt(length - 1) + input.substring(1, length - 1) + input.charAt(0);
		}
		
		System.out.println(output);

	}

}
