package staticex.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();

		card1.showInfo();
		card2.showInfo();
		card3.showInfo();

	}

}

class Card {
	static int count = 100;
	int cardNumber; // 카드번호

	public Card() {

		cardNumber = count;
		count++;
	}

	public void showInfo() {
		System.out.println("카드번호: " + cardNumber);
	}

}
