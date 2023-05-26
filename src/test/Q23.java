package test;

public class Q23 {

	public static void main(String[] args) {
		
		int[] m = {68, 55, 72, 93, 87};
		
		int total = 0;
		int average = 0;
		
        for(int i = 0; i < m.length; i++){
            total = total+m[i];
        }
        
        average = total/m.length;
        
        System.out.println("合計:");
        System.out.println(total);
        System.out.println("平均:");
        System.out.println(average);
    }

}

