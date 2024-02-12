package com.netra.array;
class MLArray{

	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows: ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}
	public class JaggedArrayDemo {

		public static void main(String[] args) {

			int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };

			System.out.println("Total Rows in Array d : " + d.length);

			MLArray.printArray(d);
		}

	}

