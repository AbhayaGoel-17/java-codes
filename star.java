package Lec2;
import java.util.Scanner;
public class star {
	public static void main(String[] args) {
		
	 Scanner df = new Scanner(System.in);
	 int n = df.nextInt();
	 int row = 1;
	 int star = n;
	 int space =0;
	 while (row<=n) {
	     int i =1;
		 while (i<=space) {
			 System.out.print("  ");
			 i++;
		 }		 
		 
		 int j =1;
		 while (j<=star) {
			 System.out.print("* ");
			 j++;
		 }
		 
		 System.out.println();
		 row++;
		 star --;
		 space ++;
	 }
	}
}
