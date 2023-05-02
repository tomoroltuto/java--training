
package polymorphism1;

//子クラスBukiでItemから継承
public class Buki extends Item {

	//親クラスからのnameとvalueをコンストラクタ作成
	public Buki(String name, int value) {
		super(name, value);
	}

	//親クラスからuseメゾットをオーバーライドする
	public void use() {
		System.out.println(name + "でこうげき！");
		System.out.println("敵に" + value + "のダメージ");
	}

}
