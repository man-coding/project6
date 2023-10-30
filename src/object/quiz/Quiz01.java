package object.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Student student1 = new Student("둘리", 5000); // 버스 객체 생성
		Bus bus = new Bus(100); // 버스 객체 생성
		student1.takeBus(bus); // 행위 작성
		student1.showInfo();
		bus.showInfo();

		Student student2 = new Student("도우너", 10000);
		Subway subway = new Subway("2호선");
		student2.takeSubway(subway);
		student2.showInfo();
		subway.showInfo();
	}

}

class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumbr) {
		this.busNumber = busNumbr;
	}

	public void take(int money) { // 수입, 승객수 증가 메소드

		this.money = this.money + money; // 버스 수입 증가
		passengerCount++; // 승객수 1명 증가
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다."); // money에
																											// this가 없어도
																											// 구분가능
	}

}

class Subway {

	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) { // 수입,승객수 증가 메소드

		this.money = this.money + money; // 버스 수입 증가
		passengerCount++; // 승객수 1명 증가
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");

	}

}

class Student {

	String studentName;
	int money;

	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

//버스에 타서 요즘 1000원을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진 돈 1000원을 잃음.

	}

//지하철에 타서 요즘 1500원을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500); // 1500원 지불
		this.money = this.money - 1500;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}