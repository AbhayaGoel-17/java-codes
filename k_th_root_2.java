package Lec10;

public class k_th_root_2 {

	public static void main(String[] args) {
		int n =128;
		int k= 3;
       System.out.println(answer(k,n));
	}
	public static int answer(int k,int n) {
		int lo=1;
		int high = n;
		int ans=0;
		while (lo<=high) {
			int mid = (lo+high)/2;
			if (Math.pow(mid,k)<=n) {
				ans=mid;
				lo=mid;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}

}
