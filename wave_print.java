package Lec11;

public class wave_print {

	public static void main(String[] args) {
		int [][]arr = {{01,02,03,04},
				       {21,22,23,24},
				       {31,32,33,34}};
		Wave(arr);
	}
	public static void Wave(int [] []arr) {
		for (int col = 0; col< arr[0].length;col++) {
			if (col%2==0) {
				for (int row = 0; row <arr.length;row++) {
					System.out.print(arr[row][col]+ " ");
				}
			}
			else {
				for (int row = arr.length-1; row >=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}

}
