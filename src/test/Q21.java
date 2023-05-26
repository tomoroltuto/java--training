package test;

public class Q21 {
	public static void main(String[] args) {
		
		int[] m = {10, 20, 30, 40, 50};
	
		for(int i = 0; i < m.length; i++) {
			
			System.out.print(m[i]);
			
			if(i != m.length -1) {
				System.out.print(",");
			}
		}
	}
}
