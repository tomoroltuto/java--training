package sample2;

public class Main {
	public static void main(String[] args) {
		int a[] = {66,12,10,43,45,52,73,65,2,39,97,76,83,11,57,63};
		
		//a表示
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		//s番号以降の最小値がどこにあるか探す
		for (int s = 0; s < a.length - 1; s++) {
			
			//最小値の場所(とりあえずSを最小値とする)
			int pos = s;
			for(int i = s + 1; i < a.length; i++) {
				if(a[i] < a[pos]) {
					pos = i;
				}
			}
			
			System.out.println("最小値は" + pos + "番目の" + a[pos]);
			
			//s番目とpos番目を交換する
			int w = a[s];
			a[s] = a[pos];
			a[pos] = w;
			System.out.println(s + "番目と" + pos + "番目に交換しました");
			
			//aの内容を表示
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			
			System.out.println();
		}
	}
}


