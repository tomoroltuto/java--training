package sample3;

public class Baburu {
	public static void main(String[] args) {
		int[] m = {6,15,4,2,8,5,11,9,7,13};
		
		int max = 0;
		int temp = 0;
		
		for(int i = m.length -1; i >= 0; i--) {			

			for(int j = 0; j < m.length-1; j ++) {
				
				if(m[j] > m[j + 1]) {
					max = j;

					temp = m[j + 1];
					m[j + 1] = m[max];
					m[max] = temp;	
				}
			}
		}
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}
}
