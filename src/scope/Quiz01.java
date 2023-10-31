package scope;

//모든 변수의 유효범위를 작성하세요.

public class Quiz01 {

	public static void main(String[] args) {

	}

}

class A {

	public int field1; // 어디서든 사용가능.
	int field2; // 클래스 외부 사용가능.(같은 패키지 안에서 사용가능)
	private int field3; // 클래스 내에서만 사용 가능.

}