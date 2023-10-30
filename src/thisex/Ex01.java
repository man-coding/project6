package thisex;

//this 사용하기
public class Ex01 {

	public static void main(String[] args) {

		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); // 태어난 연도 변경
		System.out.println(bDay); 
		bDay.printThis();   //주소값이 bDay와 같음.
	}

}

class BirthDay {
	int year;

	public void setYear(int year) {
		this.year = year; // 변수의 이름이 같을 때 this를 사용할 수 있음.
	}

	public void printThis() {
		System.out.println(this);
	}

}
