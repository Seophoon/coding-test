import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String N = input.next(); 

        input.close();

        int flag = 1;

        for(int i=0; i<N.length()/2; i++){
            char front = N.charAt(i);
            char back = N.charAt((N.length()-1)-i);

            if(front != back){
                flag = 0;
                break;
            }      
        }
        
        System.out.println(flag);     
    }
}