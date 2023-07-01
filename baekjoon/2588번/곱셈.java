import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        input.close();
        
        int C = B/100;
        int D = (B%100)/10;
        int E = (B%100)%10;

        System.out.println(A*E);
        System.out.println(A*D);
        System.out.println(A*C);
        System.out.println(A*B);
    }
}