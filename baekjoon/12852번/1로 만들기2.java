import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 시간초과가 뜬다. 


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>(); 

        arr.add(X);

        while(X>1){   
            if(X%3 == 1){
                X--;
                arr.add(X);
            }
            if(X%3 == 0){
                X = X/3;
                arr.add(X);
            }else if(X%2 == 0){
                X = X/2;
                arr.add(X);
            }

        }
        sb.append(arr+ "\n");

        System.out.println(arr.size()-1);
        for(int h : arr){
            System.out.print(h +" ");
        }
    }
}

