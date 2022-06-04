package operatorandcontrolstructure;

class Student {
	public int id;
	public String name;
	
	public void doStudying() {
		System.out.println(name + " is studying...");
	}
}

public class ArrayDemo {
	
	public static void main(String[] args) {
		/*
		int[] ages; 
		ages = new int[5];
		
		ages[0] = 15;
		ages[1] = 6;
		ages[2] = 2;
		ages[3] = 9;
		ages[4] = 19;
		*/
		
		int[] ages = new int[] {15, 6, 11, 9, 19};
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		System.out.println("--------------------------------------------");
		
		double[] sallaries = new double[] {
				15.0, 17.5, 19.7, 100.7, 1113.2
		};
		
		for(double s : sallaries) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------------------------");
		
		for(int a : ages) {
			System.out.println(a);
		}
		
		System.out.println("--------------------------------------------");
		
		Student[] students = new Student[4];
		
		Student s1 = new Student();
		s1.id = 10;
		s1.name = "Zac";
		
		Student s2 = new Student();
		s2.id = 20;
		s2.name = "James";
		
		Student s3 = new Student();
		s3.id = 30;
		s3.name = "Sam";
		
		Student s4 = new Student();
		s4.id = 40;
		s4.name = "Eddy";
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		
		for(Student student : students) {
			System.out.println(student.id + " " + student.name);
			student.doStudying();
		}
		
		
	}

}