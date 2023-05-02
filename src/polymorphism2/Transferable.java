package polymorphism2;

//インターフェース作成
public interface Transferable {

	default void displayAddress() {
		System.out.println("IPアドレスを表示します");
	}

	//メソッド作成
	void transfer();

}
