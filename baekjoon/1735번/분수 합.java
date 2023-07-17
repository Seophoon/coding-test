import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt(); // 분자
        int B = input.nextInt(); // 분모
        int A1 = input.nextInt(); // 분자1
        int B1 = input.nextInt(); // 분모2

        input.close();

        int answerA = 0; // 정답의 분자
        int answerB = 0; // 정답의 분모
        int max = 0; //최대 공약수

        if(B != B1){
            answerB = B * B1;
            answerA = A*B1 + A1*B;
        }else{
            answerB = B;
            answerA = A + A1;
        }
        for(int i=1; i<=answerA && i<=answerB; i++){
            if(answerA%i == 0 && answerB%i == 0){
                max = i;
            }
        }
        answerA /= max;
        answerB /= max; 

        System.out.println(answerA+" "+answerB);
        
    }
}