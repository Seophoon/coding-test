import java.io.*;
import java.util.Scanner;

public class Main {
    private static char[][] map;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        map = new char[n][2 * n - 1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2 * n - 1; j++)
                map[i][j] = ' ';

        drawStar(0, n - 1, n);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(map[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static void drawStar(int x, int y, int n) {
        if (n == 3) {
            map[x][y] = '*';
            map[x + 1][y - 1] = '*';
            map[x + 1][y + 1] = '*';
            for (int i = -2; i <= 2; i++) {
                map[x + 2][y + i] = '*';
            }
            return;
        }
        int half = n / 2;
        drawStar(x, y, half);
        drawStar(x + half, y - half, half);
        drawStar(x + half, y + half, half);
    }
}
