package Lec11;

public class spiral_matrix {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 },
				        { 21, 22, 23, 24 },
				        { 31, 32, 33, 34 }};
//				        { 41, 42, 43, 44 },
//				        { 51, 52, 53, 54,}};
print(arr);
	}

	public static void print(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int te = arr.length * arr[0].length;
		int count = 0;
		while (count < te) {
			for (int i = minc; i <= maxc && count<te; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			for (int i = minr; i <= maxr && count<te; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count<te; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count<te; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;

			}
			minc++;
		}
	}
}
