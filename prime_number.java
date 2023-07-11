package Lec1;

public class prime_number {

	public static void main(String[] args) {
		int n=2;
		int i =2;
		int count = 0;
		while (i<n) {
			if (n%i == 0) {
				count++;
			}
			i++;
			
		}
		if (count >=1) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
		// TODO Auto-generated method stub

	}

}
