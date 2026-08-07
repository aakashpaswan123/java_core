class Student{
	void study(){
		System.out.println("Student is studying");
	}
}

public class MethodsCall{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.study();
	}
}