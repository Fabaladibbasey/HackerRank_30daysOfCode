package hackerRank;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2D = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		
		int anotherArr [][] = {
				{-1, -1,  0, -9, -2, -2},
				{-2, -1, -6, -8, -2, -5},
				{-1, -1, -1, -2, -3, -4},
				{-1, -9, -2, -4, -4, -5},
				{-7, -3, -3, -2, -9, -9},
				{-1, -3, -1, -2, -4, -5}
		};
		
		System.out.println(hourGlasses(anotherArr));

	}

	static int hourGlasses(int[][] twoD) {
		int greaterSum = twoD[0][0];
		for(int i = 0; i < twoD.length - 2; i++) {
//			System.out.println(Arrays.toString(twoD[i]));
			for(int j = 0; j < twoD[i].length - 2; j++) {
				
				int sum = 0;
				int a = twoD[i][j];
				int b = twoD[i][j+1];
				int c = twoD[i][j + 2];
//				System.out.print(a);
//				System.out.print(b);
//				System.out.print(c);
				
//				System.out.println();
//				System.out.print(twoD[i + 1][j]);
				int d = twoD[i + 1][j + 1];
//				System.out.print(" " + d);
//				System.out.print(twoD[i + 1][j + 2]);
				
				int e = twoD[i + 2][j];
				int f = twoD[i + 2][j + 1];
				int g = twoD[i + 2][j + 2];
//				System.out.println();
//				System.out.print(e);
//				System.out.print(f);
//				System.out.print(g);
				
				sum += (a + b + c + d + e + f + g);

				if(greaterSum == twoD[0][0]) {
					greaterSum = sum;
				}
				if(greaterSum < sum) {
					greaterSum = sum;
				}
				
			}
		}
		return greaterSum;
		
}
}