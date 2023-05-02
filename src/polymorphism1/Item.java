package polymorphism1;

//親クラス
public abstract class Item {

	//nameとvalueを宣言
	String name;
	int value;
	
	//コンストラクタを作成
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	//useメゾット作成 （抽象メゾット）
	public abstract void use();
}
