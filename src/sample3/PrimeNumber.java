package sample3;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int x = 100; 

		
		for(int i = 1; i < x; i ++) {
			int n = 0;
			for(int j = 1; j <= i; j++) {
//				System.out.println("i:" + i + " j:" + j);
				if(i % j == 0) {					
					n ++;
				}
				
			}
//			System.out.println(n);
			if(n == 2) {
				System.out.println(i);
			}
		}
	}
}
