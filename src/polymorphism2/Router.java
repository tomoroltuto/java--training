package polymorphism2;

//SwitchクラスをTransferableインターフェースを作成
public class Router implements Transferable {

	//transferメソッド作成および表示
	@Override
	public void transfer() {
		System.out.println("IPアドレスを使ってデータを転送します");
	}
}
