package Lec5;

public class binary_decimal {

	public static void main(String[] args) {
		int n = 101101010;
		int sum = 0 ;
		int mul = 1 ;
		while (n>0) {
			int rem = n % 10;
			sum = sum + rem * mul ;
			mul = mul * 2 ;
			n = n / 10 ;
		}
		System.out.println(sum);

	}

}
