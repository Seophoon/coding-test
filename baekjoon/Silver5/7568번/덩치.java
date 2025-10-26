import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); //돌의 갯수

        int[][] kiMom= new int[N][2];

        for(int i=0; i<N; i++){
            kiMom[i][0] = in.nextInt(); //키
            kiMom[i][1] = in.nextInt(); //몸무게
        }

        for (int i=0; i<N; i++) {
            int rank = 1;
            
            for(int j=0; j<N; j++){
                if(i == j) continue;
                if(kiMom[i][0]<kiMom[j][0] && kiMom[i][1]<kiMom[j][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
        
        in.close();
    }
}