package Lec8;

public class insert_in_sort {

	public static void main(String[] args) {
		int [] arr= {1,2,4,5,3};
		int n = arr.length;
		Insert_in_sort(arr, arr[n-1],n-2);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
    public static void Insert_in_sort(int []arr,int item ,int i) {
    	while (i>=0 && arr[i] >item) {
    		arr[i+1]=arr[i];
    		i--;
    	}
    	arr[i+1]=item;
    }
     
}
