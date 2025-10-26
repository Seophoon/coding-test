import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int k = input.nextInt(); //주어질 수의 갯수
        
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++){
            int number = input.nextInt(); //수를 입력

            if(number == 0){//입력한 수가 0인 경우
                stack.pop();
            }else{
                stack.push(number);
            }
        }

        input.close();

        for(int j : stack){
            sum += j;
        }
        System.out.println(sum);
    }
}