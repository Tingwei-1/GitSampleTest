package Gitapp;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("3rd Version");
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 5));
	}

}
class Math {
	int add(int a, int b) {
		return a+b;
	}
}