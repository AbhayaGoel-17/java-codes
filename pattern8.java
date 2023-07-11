package Lec2;
import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner cv=new Scanner(System.in); 
		int n=cv.nextInt();
		int row =1;
		int star =1;
		int space=2*n-3; 
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
			if (row==n) {
				k=2;
			}
			while (k<=star) {
				System.out.print("* ");
				k++;
				
			}
			
			System.out.println();
			row++;
			star++;
			space-=2;
			
		}
		// TODO Auto-generated method stub

	}

}
