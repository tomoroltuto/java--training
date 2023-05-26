package test;

public class Q25 {
	public static void main(String[] args) {
		int m[] = {68, 55, 72, 93, 87};
		
		//a表示
		System.out.println("並び替え前");
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i] + " ");
		}
		
		System.out.println("並び替え後");
		
		int min = 0;
		int temp = 0;
		for(int i = 0; i < m.length; i++) {
			System.out.println("m[min]:" + m[min] + " m[i]:" + m[i]);
			min = i ;
			for(int j = i; j < m.length ; j++) {
				if (m[j] < m[min]) {
					min = j;
					
				}
			}
			temp = m[i];
			m[i] = m[min];
			m[min] = temp;
			
		}
		for(int i = 0; i < m.length; i++) {
			System.out.println(m[i] + " ");
		}

	}
}
