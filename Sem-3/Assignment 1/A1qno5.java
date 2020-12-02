//More than one classes is used to make code easily to read
class Test{
	//First give a meaning full class name
	void show() {
		//Write the function according to requirement
		System.out.println("Hello World");
	}
}
public class A1qno5 {
	//Create main class
	public static void main(String[] args) {
		//Main method of the main class
		Test t=new Test();
		//Creating the object of the other class
		t.show();
		//Calling the method of the other class
	}
}
