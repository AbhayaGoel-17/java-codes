package Lec3;

import java.util.Scanner;

public class pattern25 {

	public static void main(String[] args) {
		Scanner cv = new Scanner(System.in);
		int n = cv.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		int num = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;

			}
			int j = 1;
			while (j <= star) {
				System.out.print(num + "\t");
				num+=2;
				j++;

			}
			System.out.println();
			row++;
			star += 2;
			space--;

		}

	}

}
