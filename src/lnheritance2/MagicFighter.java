package lnheritance2;

public class MagicFighter extends Fighter {

	int mp;

	public MagicFighter() {
		this.mp = 10;
		this.name = "魔法戦士";
	}

	public void attack() {
		System.out.println(name + "の魔法攻撃!");
		System.out.println("敵に" + (atk + mp) + "のダメージ!");
	}

}
