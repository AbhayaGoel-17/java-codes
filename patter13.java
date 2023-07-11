package Lec3;
import java.util.Scanner;
public class patter13 {

	public static void main(String[] args) {
		Scanner cv= new Scanner(System.in);
		int n =cv.nextInt() ;
		int row=1;
		int star =1;
		while (row<=2*n-1) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			if (row<n) {
				star++;
			}else {
				star--;
			}
			row++;
			System.out.println();
		}
		

	}

}
