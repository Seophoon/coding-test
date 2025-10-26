import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        input.close();
        
        int three = 0;

        while(true){
            if(N%5 == 0){
                System.out.println(N/5 + three);
                break;
            }else if(N<0){
                System.out.println("-1");
                break;
            }
            N -= 3;
            three++;
        }
    }
}