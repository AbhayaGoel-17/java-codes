package Lec1;

public class gardecard {

	public static void main(String[] args) {
		int a= 75;
		int b= 65;
		int c = 55;
		int d= 45;
		int m= 78;
		if (m>=a) {
			System.out.println("garde a");
		}
		else if (m>=65 && m<=75) {
			System.out.println("garde b");
		}else if (m>=c && m<=b) {
			System.out.println("garde c");
		}
		else if (m>=d && m<=c) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		// TODO Auto-generated method stub

	}

}
