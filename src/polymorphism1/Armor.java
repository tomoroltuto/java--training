package polymorphism1;

//子クラスArmor　Itemを継承
public class Armor extends Item{

	//親クラスからのnameとvalueをコンストラクタ作成
	public Armor(String name, int value) {
		super(name, value);
	}

	//親クラスからuseメソッドをオーバーライド
	public void use() {
		System.out.println(name + "をみにつけいた！");
		System.out.println("守備力が" + value + "上がった");
	}

	
}
