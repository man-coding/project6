package object.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		Customer customer1 = new Customer("둘리", 3000);
		Cafe cafe = new Cafe("별다방");
		customer1.buyAme(cafe);
		customer1.showInfo();

		Customer customer2 = new Customer("또치", 20000);
		customer2.buyLatte(cafe);
		customer2.showInfo();

		cafe.showInfo();

	}

}

class Cafe {

	String cafeName;
	int money;

//손님에게 커피를 파는 생성자
	public void sellCoffe(int money) { // 손님에게 커피를 파는 메소드

		this.money = this.money + money;
	}

//카페 이름 초기화 생성자
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	public void showInfo() {
		System.out.println("별다방의 수입은 " + money + "입니다.");
	}
}

//손님 클래스
class Customer {

	String cusName; // 이름
	int money; // 소지금
//이름과 소지금 생성자

	public Customer(String cusName, int money) {
		super();
		this.cusName = cusName;
		this.money = money;
	}

//카페에서 아메를 사고 남은 돈 (행위)
	public void buyAme(Cafe cafe) {

		if (this.money < 4000) {
			System.out.println("둘리의 소지금이 적어 커피를 살 수 없습니다.");
			return;
		}
		cafe.sellCoffe(4000);
		this.money = this.money - 4000;

	}

	// 카페에서 라떼를 사고 남은 돈 (행위)
	public void buyLatte(Cafe cafe) {

		if (this.money < 4500) {
			System.out.println("또치의 소지금이 적어 커피를 살 수 없습니다.");
			return;
		}
		cafe.sellCoffe(4500);
		this.money = this.money - 4500;
	}

	public void showInfo() {
		System.out.println(cusName + "님의 남은 돈은 " + money + "입니다.");
	}
}
