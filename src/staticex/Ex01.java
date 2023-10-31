package staticex;

//static 변수 사용하기
public class Ex01 {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + " 학번:" + student1.studentID);

		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + " 학번:" + student2.studentID);

		System.out.println(Student.count);

	}
}

class Student {
	static int count = 0; // 공통속성
	int studentID; // 초기화시키지 않는다. 1번째 2번째 객체의 정보가 다 다르기 때문에.
	String studentName; // 초기화시키지 않는다.

	public Student() {
		count++; // 학생이 생성될 때마다 증가
		studentID = count; // 증가된 값을 학번에 부여
	}

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

}
