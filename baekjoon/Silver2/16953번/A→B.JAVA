import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        int ans = 1;
        while (B != A) {
            if (B < A) {
                ans = -1;
                break;
            }

            String str = String.valueOf(B);

            // 맨 끝자리가 1이 아니고, B가 2로 나누어 떨어지지 않으면 만들 수 없음
            if (str.charAt(str.length() - 1) != '1' && B % 2 != 0) {
                ans = -1;
                break;
            }

            if (B % 2 == 0) { // 짝수면 2로 나눔
                B >>= 1;
            } else { // 끝자리가 1이면 제거
                str = str.substring(0, str.length() - 1);
                B = Long.parseLong(str);
            }

            ans++;
        }

        System.out.println(ans);
        sc.close();
    }
}
