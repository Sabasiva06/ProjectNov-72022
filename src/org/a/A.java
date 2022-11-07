package org.a;

public class A {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		// row col
		// 1st row
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		// 2nd row
		a[1][0] = 30;
		a[1][1] = 20;
		a[1][2] = 10;

		// 3rd row
		a[2][0] = 10;
		a[2][1] = 10;
		a[2][2] = 10;

		// for iteration 2d array we need to nested for loop
		// outerfor loop --- row
		// inner for loop -->coloum

		// Row will get incre, only if condition of colu get fails
		// 1 2 7
		for (int i = 0; i < a.length; i++) { // row
			// 3 4 6
			for (int j = 0; j < a[i].length; j++) {// coloumn
				// 5
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("By using enhanced for loop");
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

	}

}
