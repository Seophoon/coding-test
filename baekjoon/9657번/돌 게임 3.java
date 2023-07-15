import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //돌의 수

        input.close();

        if(N%7 == 2 || N%7 == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }   

    // 1  2  3  4  5  6  7  
    // SK CY SK SK SK SK CY 
    }
}