public class Example05_01 {
    public void displayInstance() {
		System.out.println("Hello from Instance.");
	}

	public static void displayStatic() {
		System.out.println("Hello from Static.");
	}

    public static void main(String[] args) {
		System.out.println("Test call static method.");
		Example05_01.displayStatic(); 
		Example05_01 obj = new Example05_01();
		System.out.println("Test call instance method.");
		obj.displayInstance();
    }
}
