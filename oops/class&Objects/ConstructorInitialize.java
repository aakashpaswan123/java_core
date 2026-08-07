class Student{
	String name;
	Student(String n){  // use case:object bnate hi data set ho jaye.
		name=n;
	}
}

public class ConstructorInitialize{
	public static void main(String[]args){
		
		Student s1 = new Student("Rakesh");
		System.out.println(s1.name);
		
		Student s2 = new Student("ak");
		System.out.println(s2.name);
		
	}
}