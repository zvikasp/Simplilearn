package Simplilearn;

class defAccessSpecifier {
	void display() {
		System.out.println("You are using default access specifier");
	}
}

class priAccessSpecifier{
	private void display() {
		System.out.println("You are using private access specifier");
	}
}

public class accessSpecifiers1 {

	public static void main(String[] args) {
		// default
		System.out.println("Default Access Modifier");
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();
		
		// private
		System.out.println("Private Access Specifier");
		priAccessSpecifier obj1 = new priAccessSpecifier();
		//obj1.display();
	}

}
