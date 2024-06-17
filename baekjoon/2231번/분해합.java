import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        input.close();

        int result = 0;
        
        for(int i=0; i<A; i++){
            int number = i;
            int sum = 0;
            
            while(number != 0){
                sum += number % 10; //각 자릿수를 더한다.
                number /= 10; 
            }
            if(i + sum == A){ // 누적된 값과 생성자랑 같은 경우
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
