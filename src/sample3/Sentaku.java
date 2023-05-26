package sample3;

public class Sentaku {
	public static void main(String[] args) {
		int[] m = {6,15,4,2,8,5,11,9,7,13};
	
		int min = 0;
		int temp = 0;
	
		for(int i = 0; i < m.length; i ++) {
			min = i;
			
			for(int j = i; j < m.length; j++) {
				
				if(m[j] < m[min]) {
					min = j;
				}
			}			
			temp = m[i];
			m[i] = m[min];
			m[min] = temp;
			
		}

		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		
	}
}
