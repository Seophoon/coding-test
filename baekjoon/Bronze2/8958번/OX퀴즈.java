import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String[] testCase = new String[input.nextInt()];

        for(int i=0; i<testCase.length; i++){
            testCase[i] = input.next();
        }
        input.close();

        for(int i=0; i<testCase.length; i++){
            int ren = 0;
            int sum = 0;
            for(int j=0; j<testCase[i].length(); j++){
                 if(testCase[i].charAt(j) == 'O'){
                    ren++;
                 }else{
                    ren = 0;
                 }
                 sum += ren;
            }
            System.out.println(sum);
        } 
    }
}
