package operatorandcontrolstructure;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello ");
		
		if(s1.equals(s2.trim())) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are different");
		}
		
		String s3 = s1.concat(s2);
		
		System.out.println(s3);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.charAt(1));
		System.out.println(s3.lastIndexOf('l'));
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3, 7));
		

	}

}
