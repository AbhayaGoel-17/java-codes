package Lec3;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner cv= new Scanner(System.in);
		int n =cv.nextInt() ;
		int row=1;
		int star =1;
		int space =n-1;
		while (row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;	
					}
			
			if (row<n) {
				star++;
				space--;
			}else {
				star--;
				space++;
			}
			row++;
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
