import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }
        input.close();

        
        Arrays.sort(arr, (arr1, arr2) ->{
            if(arr1[0] == arr2[0]){
                return arr1[1]-arr2[1];
            }else{
                return arr1[0]-arr2[0];
             }
        });

        StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		System.out.println(sb);
    }
}
