package polymorphism2;

//SwitchクラスをTransferableインターフェースを作成
public class Switch implements Transferable {

	//transferメソッド作成および表示
	public void transfer() {
		System.out.println("MACアドレスを使ってデータを転送します");
	}

}
