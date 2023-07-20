import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt(); //소인수분해를 할 수

        input.close();

        // int temp = 0;

        for(int i=2; i<=T; i++){
            while(T%i == 0){
                System.out.println(i);
                T = T/i;
            }
        }
        
        if(T != 1) {
            System.out.println(T);
        }
    }
}