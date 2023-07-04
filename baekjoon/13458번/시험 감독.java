import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //시험장의 수
        int[] arr = new int[N]; //시험장의 수만큼 배열 선언
        for(int i=0; i<N; i++){
            arr[i] = input.nextInt(); //시험장에 학생수 선언
        }
        int B = input.nextInt(); //총감독의 감시할 수 있는 응시자의 수
        int C = input.nextInt(); //부감독의 감시할 수 있는 응시자의 수

        input.close();
        
        long total = 0; //감독 계산을 위한 학생 수
        long count = 0; //감독 총원
        for(int i=0; i<N; i++){
            total = arr[i]-B;
            count++;
            if(total >0){
                count += total/C;
                if(total%C != 0){
                    count++;
                }

            }
        }
        System.out.println(count);

       
    }
}