package session4;

public class Parent {

	// private access specifier can call only inside of the class
	// declaring method1

	private void method1() {

		System.out.println("Parent's method1()");
		// prints Parent's method1() statement

	}

	// declaring method2 can be called outside the class

	public void method2() {
		
		System.out.println("Parent's method2()");
		// prints Parent's method2() statement

		method1();// calling private method1()

	}

}
