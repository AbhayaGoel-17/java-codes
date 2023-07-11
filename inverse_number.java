package Lec6;

import java.util.Scanner;

public class inverse_number {

	public static void main(String[] args) {
		Scanner cv= new Scanner(System.in);
		int n=cv.nextInt();
		System.out.println(Inverse(n));
	}
	public static int Inverse(int n) {
		int sum =0;
		int position =1;
		while (n>0) {
			int rem=n%10;
			sum = (int) (sum + position * Math.pow(10,rem-1)) ;
			position ++;
			n = n/10;
		}
		return sum;
	}
}
