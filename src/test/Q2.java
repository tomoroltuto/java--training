package test;

public class Q2 {
	
	public static void main(String[] args) {

		int tate = 6;
		int yoko = 10;
		String m = "■";
		String n = "　　";
		
		for(int i = 0; i < tate; i++) {
			for(int j = 0; j < yoko; j++) {
				if (j % 2 == i % 2) {
					System.out.print(m);
				}else {
					System.out.print(n);
				}
			}
			System.out.println();
		}	
	}

}
