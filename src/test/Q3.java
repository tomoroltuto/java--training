package test;

public class Q3 {
	public static void main(String[] args) {
		
		int tate = 10;
		int yoko = 8;
		
		for (int i = 0; i < tate; i++) {
			for(int j = 0; j < yoko; j ++) {
				if ( i == j) {
					System.out.print("■");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
