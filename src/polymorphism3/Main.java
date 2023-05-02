package polymorphism3;

public class Main {

	public static void main(String[] args) {

		//以下の実装をポリモーフィズムにリファクタリングするようにする
		Coupon cp = new PercentageCoupon(0.3);
		System.out.println(Casher.payment(5000, cp));
		Coupon cp2 = new FixedCoupon(1000);
		System.out.println(Casher.payment(5000, cp2));
		Coupon cp3 = new PercentageCoupon(0.5);
		System.out.println(Casher.payment(5000, cp3));
		Coupon cp4 = new FixedCoupon(1500);
		System.out.println(Casher.payment(5000, cp4));
	}
}
