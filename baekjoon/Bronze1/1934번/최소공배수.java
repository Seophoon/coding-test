import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt(); //반복 횟수

        for(int i=0; i<T; i++){
            int A = input.nextInt(); 
            int B = input.nextInt();

            int d = gcd(A, B); //최대공약수 구하기
            
            System.out.println(A*B/d); //최소공배수 구하는 수식
        } 
        input.close();
    }
    public static int gcd(int A, int B){ //최대 공약수 구하는 거
        if(A < B){
                int temp = A;
                A = B;
                B = temp;
            }
            while(B != 0){
                int r = A%B;
                A = B;
                B = r;
            }
            return A;
    }
}