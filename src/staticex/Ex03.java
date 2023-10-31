package staticex;

//static 변수와 메소드를 사용하여 계산기 만들기
public class Ex03 {

	public static void main(String[] args) {

		System.out.println(10 * 10 * Calculator.pi);
		System.out.println(Calculator.plus(10, 5));
		System.out.println(Calculator.minus(10, 5)); 
	}

}

class Calculator {
	static double pi = 3.14159; // 파이값 정의

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}