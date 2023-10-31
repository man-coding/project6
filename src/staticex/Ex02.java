package staticex;

public class Ex02 {

	public static void main(String[] args) {

		Student2 student1 = new Student2();
		student1.studentName = "둘리";
		System.out.println(Student2.getCount()); //private 지정되어 있어서 게터를 통해서 꺼내와야 함

		Student2 student2 = new Student2();
		student2.studentName = "도우너";
		System.out.println(Student2.getCount());
	}

}

class Student2 {
	private static int count = 0; // private 는 클래스 내부에서만 쓸 수 있음.(외부에서 사용하려면 public 만들어야 함)
	int studentID;
	String studentName;

	public Student2() { // 클래스와 함수명이 동일. void없어야 함.
		count++;
		studentID = count;
	}

	public static int getCount() { // 리턴값만 있음
		return count;
	}

	public static void setCount(int count) { // set 입력값만 있음
		Student2.count = count; // count가 static 변수이기 때문에 메소드도 static를 붙여 줘야 한다. 스태틱 변수는 앞에 클래스 이름을 붙여줘야
								// 한다.(this 안 먹힘)
		// studentName = "둘리";//오류남. 스태틱메모리와 인스턴스 같이 사용할 수 없다.

	}
}
