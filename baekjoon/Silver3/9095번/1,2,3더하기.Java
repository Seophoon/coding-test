import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.nextLine());

		for (int t = 0; t < a; t++) {
			int n = Integer.parseInt(sc.nextLine());
			int[] dp = new int[11];

			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;

			for (int i = 4; i <= n; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
            System.out.println(dp[n]);
		}
            
    sc.close();
    }
}
