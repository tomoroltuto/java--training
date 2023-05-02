package polymorphism3;

//PercentageCouponクラスをCouponインターフェースを作成
public class PercentageCoupon implements Coupon {

	//rateを定義　メンバ変数を作成
	double rate;

	//コンストラクタ作成
	public PercentageCoupon(double rate) {
		this.rate = rate;
	}

	//discountメソッド作成　rateがdoubleなのでintに変換する
	public int discount(int amount) {		
		return (int) (amount * rate);
	}
}
