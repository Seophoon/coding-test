import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt(); // 두 수가 주어진다.
        int B = input.nextInt(); //두 수가 주어진다.
        input.close();

        int cgys = gcd(A,B); // 최대 공약수 구하기
        int cgbs = A*B/cgys; // 최소 공배수 구하기

        System.out.println(cgys);
        System.out.println(cgbs);
    }

    public static int gcd(int A, int B){
        if(A < B){ // A가 크고 B가 작아야 구할 수 있다. 
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