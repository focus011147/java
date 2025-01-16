import java.util.Scanner;

public class Example05_02 {
	public void mainProgram() {
		Scanner scanner = new Scanner(System.in);
		boolean done = true;
		int radius;
		myPrintln("Program Calculate Area...");
		do {
			myPrint("Enter radius(-1 : exit) : ");
			radius = scanner.nextInt();
			if (radius != -1) {
				double area = calArea(radius);
				double circum = calCircumference(radius);
				myPrintln("Radius : " + radius);
				myPrintln("Area Circle = " + area);
				myPrintln("Circumference : " + circum);
				myPrintln("");
			}
			else if (radius == -1) {
				myPrintln("now exit program.");
				done = false;
			}
		} while(done);
		scanner.close();
	}
	public double calArea(double radius) {
		double area = Math.PI * Math.pow(radius,2);
		return area;
    }
	public double calCircumference(double radius) {
		double circum = 2 * Math.PI * radius;
		return circum;
    }
	public void myPrint(String str) {
		System.out.print(str);
	}

	public void myPrintln(String str) {
		System.out.println(str);
	}

    public static void main(String[] args) {
		Example05_02 obj = new Example05_02();
		obj.mainProgram();
    }
}
