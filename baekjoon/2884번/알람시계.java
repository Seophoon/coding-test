import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt(); //시간
        int M = input.nextInt(); //분
        input.close();
        
        if(M < 45){ //분이 45분 미만인 경우
            H -= 1; //시간 감소
            if(H < 0){ //감소한 시간이 0시보다 작다면
                H = 23; //23시로 변경
            }
            M = M + 60 - 45;
        }else{
            M = M - 45;
        }
        System.out.println(H+ " " +M);
    }
}
