import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        char[][] ch = new char[5][15]; // 2차원 배열 생성
        int max = 0; // 가로글의 최대 길이를 알아내기 위한 변수 선언

        for(int i=0; i<ch.length; i++){
            String str = input.next(); // 단어를 입력
            if(max < str.length()) max = str.length(); // 글의 최대길이를 max에 저장

            for(int j=0; j<str.length(); j++){
                ch[i][j] = str.charAt(j); // 입력한 단어를 한 글자씩 배열에 삽입
                // System.out.print(str.charAt(j)); 맞게 들어갔는지 확인
            }
        }
        input.close();

        for(int n=0; n<max; n++){
            for(int m=0; m<5; m++){
                if(ch[m][n] == '\0') continue; // 빈 문자열은 출력하지 않는다.
                System.out.print(ch[m][n]); // 2차원 배열을 세로로 출력
            }
        }
    }
}