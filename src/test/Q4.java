package test;

public class Q4 {

	public static void main(String[] args) {
		
		int saidai = 20;
		int baisu = 4;
		
		for(int i = 1; i <= saidai; i++) {
			
			if( i % baisu == 0 ) {
				System.out.println(i);
			}
		}
	}
}
