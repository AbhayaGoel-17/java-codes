package Lec3;

import java.util.Scanner;

public class rohmbus {

	public static void main(String[] args) {
		Scanner cv= new Scanner(System.in);
		int n =cv.nextInt() ;
		int row=1;
		int star =1;
		int space = n-1;
		int val=1;
		while (row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while (j<=star) {
				System.out.print("* ");
				j++;
			}
			if (row<n) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
		

	}

}
