class Student{
	String name;
	Student(String name){
		this.name = name;
	}
}

public class ArrayOfObjects{
	public static void main(String[]args){
		Student[] s = {
			new Student("Rahul"),
			new Student("Aman"),
			new Student("Riya")
		};
		
		for(Student x:s){
			System.out.println(x.name);
		}
		
	}
}
