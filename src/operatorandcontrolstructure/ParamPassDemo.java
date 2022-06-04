package operatorandcontrolstructure;

class Num {
	public int n;
}

public class ParamPassDemo {
	
	public void modify(String str) {
		System.out.println("-----Inside-Modify-----");
		
		str = "10";
		System.out.println("value of str in modify: " + str);

		System.out.println("-----Exiting-Modify-----");
	}
	
	
	public void modify(Num num) {
		System.out.println("-----Inside-Modify-----");
		
		num.n = 10;
		System.out.println("value of num.n in modify: " + num.n);

		System.out.println("-----Exiting-Modify-----");
	}
	
	public void modify(int n) {
		System.out.println("-----Inside-Modify-----");
		
		n = 10;
		System.out.println("value of n in modify: " + n);
		System.out.println("-----Exiting-Modify-----");
	}

	public static void main(String[] args) {
		 System.out.println("-----Inside-Main-----");
		 ParamPassDemo demo = new ParamPassDemo();
		 
		 int n = 5;
		 System.out.println("Value of n before invoking modify: " + n);
		 
		 demo.modify(n);
		 System.out.println("Value of n after invoking modify: " + n);
		 
		 System.out.println("-------------------------------");
		 
		 Num num = new Num();
		 num.n = 5;
		 System.out.println("Value of num.n before invoking modify: " + num.n);
		 demo.modify(num);
		 System.out.println("Value of num.n after invoking modify: " + num.n);
		 
		 System.out.println("-------------------------------");
		 
		 String str = "5";
		 System.out.println("Value of str before invoking modify: " + str);
		 demo.modify(str);
		 System.out.println("Value of num.n after invoking modify: " + str);
		 
		 System.out.println("-----Exiting-Main-----");
	}

}
