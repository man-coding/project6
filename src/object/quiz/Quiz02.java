package object.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		Student3 student = new Student3("둘리", 8000); // 학생 소지금 호춫ㄹ
		Taxi taxi = new Taxi("70 1234"); // 차 넘버 호출
		student.takeTaxi(taxi); // 둘리가 택시를 타는 행위 호출

		student.showInfo(); // 학생의 현재정보 출력
		taxi.showInfo(); // 택시의 현재정보 출력

	}

}

class Taxi {
	String taxiNumber;
	int money;

	public Taxi(String taxiNumber) { // 택시 넘버 선언
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) { // 택시 수입 함수

		this.money = this.money + money;

	}

	public void showInfo() {
		System.out.println("택시 " + taxiNumber + "의 수입은 " + money + "입니다.");
	}
}

class Student3 {
	String studentName;
	int money;

	public Student3(String studentName, int money) { // 학생 이름과 소지금 함수
		super();
		this.studentName = studentName;
		this.money = money;
	}

	public void takeTaxi(Taxi taxi) { // 학생이 택시를 타는 행위 함수
		if (money < 10000) {
			System.out.println("소지금이 적어 택시를 탈 수 없습니다.");
			return;
		}

		taxi.take(10000);
		this.money = this.money - 10000;

	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}
