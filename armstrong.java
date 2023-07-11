package Lec6;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		
	Scanner cv= new Scanner(System.in);
	int n=cv.nextInt();
	System.out.println(Is_Armstrong(n));
}
	public static boolean Is_Armstrong(int n) {
		int d=countofdigit(n);
		int sum=0;
		int p =n;
		
		while (n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem,d));
			n = n/10;
		}
		return sum==p;
	}
    public static int countofdigit(int n) {
	int count = 0;
	while (n>0) {
		n = n/10;
		count++;
	}
	return count;

}
    
}

