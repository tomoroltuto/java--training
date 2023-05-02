package lnheritance1;

public class Main {

	public static void main(String[] args) {

		Employee taro = new Employee();
		taro.name = "タロウ";

		Manager hanako = new Manager();
		hanako.name = "ハナコ";

		taro.operation();
		hanako.operation();
		hanako.management();
	}
	
}
