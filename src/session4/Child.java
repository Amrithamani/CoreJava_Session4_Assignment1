package session4;

//child class inheriting  parent class

public class Child extends Parent {

	// declaring method1

	public void method1() {

		System.out.println("Child's method1()");
		// prints Child's method1()

	}

	public static void main(String args[]) {

		Parent p = new Child();
		// parent class reference is used to refer to a child class object

		p.method2();// object calling method2 in parent

	}

}
