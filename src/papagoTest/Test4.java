package papagoTest;

public class Test4 {

	 void plus(int a, int b){
		System.out.println(a + b);
	}
	 void minus(int a, int b){
		System.out.println(a - b);
	}
	 void multiplication(int a, int b){
		System.out.println(a * b);
	}
	 void division(int a, int b){
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.plus(3,7);
		t.minus(10, 5);
		t.multiplication(2, 5);
		t.division(10, 2);
	}
}
