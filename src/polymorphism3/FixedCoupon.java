package polymorphism3;

//FixedCouponクラスをCouponインターフェイスに実装する
public class FixedCoupon implements Coupon {

	//変数を作成
	int discountAmount;

	//コンストラクタを作成
	public FixedCoupon(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	//discountめ
	public int discount(int amount) {
		return amount - discountAmount;
	}
}
