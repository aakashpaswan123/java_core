class Engine{
	void start(){
		System.out.println("Engine Started");
	}
}

class Car{
	Engine e = new Engine();
	void drive(){
		e.start();
		System.out.println("Car Running");
	}
}

public class EkObjectSeDusraObjectUse{
	public static void main(String[]args){
		Car c = new Car();
		c.drive();
	}
}
