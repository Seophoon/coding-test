import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int stack[]; // 다른 함수에서도 쓸 수 있게 static선언
    public static int size; // 다른 함수에서도 쓸 수 있게 static선언
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); 

        int N = input.nextInt(); // 명령의 수
        stack = new int[N]; // 배열의 크기


        for(int i=0; i<N; i++){
            String comment = input.next(); // 명령을 입력받는다.
            switch(comment){
                case "push" : // 명령이 push인 경우
                    push(input.nextInt()); //재귀함수 사용, 입력한 숫자를 데려감
                    break;
                
                case "pop" : // 명령이 pop인 경우
                    sb.append(pop()).append("\n"); // pop()함수로 이동
                    break;

                case "size" : // 명령이 size인 경우
                    sb.append(size()).append("\n"); // size()함수로 이동
                    break;

                case "empty" : // 명령이 empty인 경우
                    sb.append(empty()).append("\n"); // empty()함수로 이동
                    break;
                
                case "top" : // 명령이 top인 경우
                    sb.append(top()).append("\n"); // top()함수로 이동
                    break;
            }
        }
        input.close();  
        System.out.println(sb); //StringBuilder 출력
    }

    public static void push(int num){
        stack[size] = num; // 배열에 데려온 숫자를 입력
        size++;
    }
    public static int pop(){
        if(size == 0){ // 배열이 비어있을 경우
            return -1;
        }else{ // 배열이 비지 않았을 경우
            int num = stack[size-1]; // 마지막에 넣은 숫자를 가져오고
            stack[size-1] = 0; // 그 칸을 비운다.
            size--;
            return num;
        }
    }
    public static int size(){
        return size; // 배열의 길이
    }
    public static int empty(){
        if(size == 0){ // 배열이 비었을 경우
            return 1;
        }else{ // 안비었을 경우
            return 0;
        }
    }
    public static int top(){
        if(size == 0){ // 배열이 비었을 경우
            return -1;
        }else{ // 안비었을 경우 마지막 숫자를 가져온다.
            return stack[size-1];
        }
    }
             
}
