class Student{
	String name;
	void display(){
		System.out.println("Name: "+name);
	}
}

public class Object_ApnaDataUse{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.name="Rakesh";
		s1.display();
		
		Student s2 = new Student();
		s2.name="Rinku";
		s2.display();
	}
}