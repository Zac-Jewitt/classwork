package assignments.stringmanipulations;

public class Assignment4 {

	public static void main(String[] args) {
		String input = "This is java String program ";
		String longestStr = "";
		String temp = "";
		
		input = input.trim();
		
		while(input.contains(" ")) {
			temp = input.substring(0, input.indexOf(" "));
			
			if(temp.length() > longestStr.length()) {
				longestStr = temp;
			}
			
			input = input.substring((input.indexOf(" ") + 1), input.length());
		}

		if(input.length() > longestStr.length()) {
			longestStr = input;
		}
		
		System.out.println(longestStr);
	}

}
