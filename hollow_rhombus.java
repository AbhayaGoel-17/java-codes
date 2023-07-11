package Lec4;
import java.util.Scanner;
public class hollow_rhombus {

	public static void main(String[] args) {
		 Scanner cv= new Scanner(System.in);
			int N =  cv.nextInt();
			int rows = N;
	        int i = 1;

	        while (i <= rows) {
	            int j = 1;

	            while (j <= rows - i) {
	                System.out.print(" ");
	                j++;
	            }

	            int k = 1;

	            while (k <= N) {
	                if (i == 1 || i == rows || k == 1 || k == N) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	                k++;
	            }

	            System.out.println();
	            i++;
	        }
	}

}
