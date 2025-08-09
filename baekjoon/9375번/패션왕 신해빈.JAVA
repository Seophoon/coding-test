import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int tt = 0; tt < t; tt++) {
            int n = Integer.parseInt(br.readLine());

            // n == 0 인 경우 바로 0 출력
            if (n == 0) {
                sb.append(0).append('\n');
                continue;
            }

            String[][] clothes = new String[n][2];
            for (int i = 0; i < n; i++) {
                String[] wear = br.readLine().split(" ");
                clothes[i][0] = wear[0]; // 이름 (사용 안해도 됨)
                clothes[i][1] = wear[1]; // 종류
            }

            Arrays.sort(clothes, (a, b) -> a[1].compareTo(b[1]));

            long product = 1;
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (clothes[i][1].equals(clothes[i - 1][1])) {
                    count++;
                } else {
                    product *= (count + 1);
                    count = 1;
                }
            }
            product *= (count + 1); // 마지막 종류 처리

            sb.append(product - 1).append('\n'); // 아무것도 안 입는 경우 제외
        }
        System.out.print(sb);
    }
}