package assignments.stringmanipulations;

public class Assignment7 {

	public static void main(String[] args) {
		String input = "hello java";
		String output = "";
		char temp;
		
		for(int i = 0; i < input.length(); i++) {
			
			temp = input.charAt(i);
			
			if(temp == ' ') {
				output += temp;
			}
			else {
				output += ++temp;
			}
			
		}
		
		System.out.println(output);

	}

}
