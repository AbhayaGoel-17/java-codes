package Lec3;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		Scanner cv = new Scanner(System.in);
		int n = cv.nextInt();
		int row = 1;
		int star = n / 2;
		int space = 1;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int y = 1;
			while (y <= star) {
				System.out.print("* ");
				y++;
			}
			if (row <= n / 2) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}

}
