import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); //낮에 올라가는 높이
        int B = in.nextInt(); //밤에 떨어지는 높이
        int V = in.nextInt(); //나무길이
        in.close();

        int date = 0;
        
        //date = V/(A-B); 이럼 정상에 도착하면 멈춰야하는데 내려가서 하루가 추가된다.
        date = (V-B)/(A-B);
        if((V-B)%(A-B) != 0){
            date++;
        }
        System.out.println(date);


        // 이거는 시간초과 뜸, 반복문 때문에
        // int date = 0;
        // int height = 0;
        // while(true){
        //     date++;
        //     height += A;
        //     if(height >= V){
        //         break;
        //     }
        //     height -= B;
        // }
        // System.out.println(date);
    }
}
