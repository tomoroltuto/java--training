package polymorphism4;

public class Quiz {

	private String main;

	public Quiz(String main) {
		this.main = main;
	}

	public void displayHeader() {
		System.out.println("次の問いに答えなさい");
	}

	void displayMain() {
		System.out.println(main);
	}
}
