package object;

public class Ex01 {

	public static void main(String[] args) {

		Student student = new Student("둘리", 10000);    //1. 객체를 생성한다.
		Bus bus = new Bus(100);	                        //2. 객체를 생성한다.	
		student.takeBus(bus);                           //3. 메소드를 호출한다.
		student.takeBus(bus);// 상황종료                  //4. 메소드를 호출한다.

		student.showInfo();
		bus.showInfo();
	}

}

class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumbr) {
		this.busNumber = busNumbr;
	}

	public void take(int money) { // 버스요금

		this.money = this.money + money; // 버스 수입 증가
		passengerCount++; // 승객수 1명 증가
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다."); // money에
																											// this가 없어도
																											// 구분가능
	}

}

//지하철 클래스
class Subway {

	String lineNumber;
	int passengerCount;
	int money;

//지하철 노선번호를 초기화하는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

//지하철에 승객을 태우는 메소드
	public void take(int money) { // 버스요금

		this.money = this.money + money; // 버스 수입 증가 -> this.money = money; 로 치면 안됨.
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
	public void takeBus(Bus bus) { // Bus bus <- 필요한 입력값. 중요한 매개변수 가장 중요함!!!!
		bus.take(1000); // 1000원 지불 tatke 함수 호출. 상호작용 끝남.
		this.money = this.money - 1000; // 가진 돈 1000원을 잃음.

	}

//지하철에 타서 요즘 1500원을 지불하는 메소드
	public void takeSubway(Subway subway) { // Subway subway <- 필요한 입력값. 중요한 매개변수 가장 중요함!!!!
		subway.take(1500); // 1500원 지불 take 함수 호출. 상호작용이 끝남.
		this.money = this.money - 1500;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}