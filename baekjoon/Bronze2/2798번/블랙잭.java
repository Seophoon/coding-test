import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt(); // 수의 갯수
        int M = input.nextInt(); // 만들어야하는 수

        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }
        input.close();

        int result = 0;

        for(int j=0; j<N-2; j++){
            for(int k=j+1; k<N-1; k++){
                for(int l=k+1; l<N; l++){
                    int hap = arr[j] + arr[k] + arr[l];
                    if(hap == M){
                        result = hap;
                    } 
                    if(result < hap && hap < M){
                        result = hap;
                    }
                }
            }
        }
        System.out.println(result);
        
    }
}