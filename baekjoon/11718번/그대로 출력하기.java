import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while((input.hasNextLine())){
            String aaa = input.nextLine();
            System.out.println(aaa);
            if(aaa == null || aaa.isEmpty()){
                break;
            }
        }

        input.close();  
    }
}