class Student{
	String name;
	int age;
}

public class MultipleObject{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.name="Deepak";
		s1.age=22;
		
		Student s2 = new Student();
		s2.name="rk";
		s2.age=24;
		
		System.out.print(s1.name+" "+s1.age);
		System.out.println();
		System.out.print(s2.name+" "+s2.age);
	}
}