import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt(); //支払うお金
        
        input.close();

        //小銭は　５００円、１００円、５０円、１０円、５円、１円がある。

        int[] arr = {500, 100, 50, 10, 5, 1};

        int total = 1000 - T; //釣銭
        int coin = 0;

        for(int i=0; i<arr.length; i++){
            coin += total/arr[i];
            total = total%arr[i];
        }

        System.out.println(coin);

        //これも成功した
        // coin = total/500;
        // coin += (total%500)/100;
        // coin += ((total%500)%100)/50;
        // coin += (((total%500)%100)%50)/10;
        // coin += ((((total%500)%100)%50)%10)/5;
        // coin += (((((total%500)%100)%50)%10)%5)/1;
        // System.out.println(coin);    
    }
}