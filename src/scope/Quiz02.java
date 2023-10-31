package scope;

//모든 변수의 유효범위 (인스턴스변수,클래스변수 / 전역변수,지역변수)

public class Quiz02 {

	public static void main(String[] args) {

	}

}

class Person {
//인스턴스변수	
	String personName; // 인스턴스 생성시 사용 가능 //같은 패키지
	int personAge;
//클래스변수	
	static char gender = 'F'; // 인스턴스를 생성하지 않아도 사용 가능(프로그램 시작시 바로 생성) //클래스 외부 사용 가능

	// 지역변수
	public void setPersonName(String name) {
		this.personName = name; // 함수 안에서만 사용
	}

//지역변수
	public void setPersonAge(int age) {
		this.personAge = age; // 함수 안에서만 사용
	}
}
