import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        input.close();
        
        if(A == B && A == C){
            System.out.println(10000 + A * 1000);
        }else if(A == B || A == C){
            System.out.println(1000 + A * 100);
        }else if (B == C){
            System.out.println(1000 + B * 100);
        }else{
            System.out.println(Math.max(Math.max(A, B), C)*100);
        }
    }
}