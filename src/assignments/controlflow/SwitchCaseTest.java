package assignments.controlflow;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char c = 'E';
		
		switch(Character.toLowerCase(c)) {
			case 'a': {
				isVowel(c);
				break;
			}
			
			case 'e': {
				isVowel(c);
				break;
			}
			
			case 'i': {
				isVowel(c);
				break;
			}
			
			case 'o': {
				isVowel(c);
				break;
			}
			
			case 'u': {
				isVowel(c);
				break;
			}
			
			default: {
				System.out.println(c + " is not a vowel.");
			}
		}
		
	}
	
	public static void isVowel(char c) {
		System.out.println(c + " is a vowel.");
	}
	
}
