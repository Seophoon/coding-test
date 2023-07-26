import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt(); //중복되지 않는 N개의 수
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            int M = input.nextInt();
            list.add(M);
        }

        input.close();

        Collections.sort(list);

        for(int C : list){
            sb.append(C).append("\n");
        }

        System.out.println(sb);
    }
}