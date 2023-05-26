package sample3;

public class Divisor {
	
	public static void main(String[] args) {
		
		int a = 45;
		int b = 27;
		int r = a % b;
		
		for(int i = 0; i < 100; i++) {

			if(r == 0) {
				
			}else {
				a = b;
				b = r;
				r = a % b;
			}
		}
		System.out.println(b);
	}

}
