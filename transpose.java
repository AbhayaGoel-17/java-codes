package Lec11;

public class transpose {

	public static void main(String[] args) {
	 int [][]arr= {{11,12,13,14},
		       {21,22,23,24},
		       {31,32,33,34},
		       {41,42,43,44}};
	 Transpose(arr);
	 for(int i=0;i<arr.length;i++) {
			for(int j =0 ;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			}
	 
	}
	public static void Transpose(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j =i+1 ;j<arr[0].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}

}
