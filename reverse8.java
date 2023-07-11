package Lec2;

import java.util.Scanner;

public class reverse8 {

	public static void main(String[] args) {
		Scanner cv=new Scanner(System.in); 
		int n=cv.nextInt();
		int row =1;
		int star =n;
		int space=-1; 
		while(row<=n) {
			int i= 1;
			while (i<=star) {
				System.out.print("* ");
				i++;
				
			}
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
				
			}
			int k=1;
			if(row==1){
				k=2;
     				
			}
			while (k<=star) {
				System.out.print("* ");
				k++;
				
			}
			
			System.out.println();
			row++;
			star--;
			space+=2;
			
		}
		// TODO Auto-generated method stub

	}

}
