package test;

public class Q24 {
	public static void main(String[] args) {
		
		int[] m = {68, 55, 72, 93, 87};
		
		int maxNumber = 0;
		
		for(int i = 0; i < m.length; i++) {
//			System.out.println("m[maxNumber]:" + m[maxNumber] + " m[i]:" + m[i]);
			if(m[maxNumber] < m[i]) {
				maxNumber = i;
			}
		}
		System.out.println(m[maxNumber]); 
		System.out.println(maxNumber);
	}
}
