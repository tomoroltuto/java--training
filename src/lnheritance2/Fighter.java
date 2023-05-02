package lnheritance2;

public class Fighter {
	
	String name;
	int atk;
	
	public Fighter() {
		name = "戦士";
		atk = 10;
	}
	
	public void attack() {
		System.out.println(name + "の攻撃!");
		System.out.println("敵に" + atk + "のダメージ!");
	}

}
