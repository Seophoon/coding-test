import java.util.*;
public class Main
{
    public long sumFunc(int[] arr, long mid) {
        long sum = 0;
        for(int x : arr) {
            if (x - mid > 0) sum += (x - mid);
            else sum += 0;
        }
        return sum;
    }
    
    public long solution(int n, int m, int[] arr) {
        long answer = 0;
        long lt = 0, rt = Arrays.stream(arr).max().getAsInt();
        while (lt <= rt) {
            long mid = (lt + rt) / 2;
            if (sumFunc(arr, mid) >= m) {
                lt = mid + 1;
                answer = mid;
            }
            else rt = mid - 1;
        }
        return answer;
    }
    
	public static void main(String[] args) {
	    Main T = new Main();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	        arr[i] = sc.nextInt();
	    }
		System.out.println(T.solution(n, m, arr));
	}
}