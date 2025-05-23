import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] arr;
	static int[][] dp;
	static int N;
	static int weight;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		weight = Integer.parseInt(st.nextToken());
		
		
		arr = new int[N+1][2];
		dp = new int[N+1][weight+1];
		
		for(int i = 1 ; i <= N ;i ++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st1.nextToken());
			arr[i][1] = Integer.parseInt(st1.nextToken());
		}
		
		for(int i = 1 ; i <= N ; i++) {
			for(int j = 1 ; j <= weight ; j++) {
				if(j - arr[i][0] >= 0)
					dp[i][j] = Math.max( dp[i-1][j], arr[i][1]+dp[i-1][j-arr[i][0]]);
				else 
					dp[i][j] = dp[i-1][j];
			}
		}
		
		System.out.println(dp[N][weight]);
    }
}