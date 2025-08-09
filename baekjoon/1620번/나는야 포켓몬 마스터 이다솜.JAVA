import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, String> numToName = new HashMap<>();
        Map<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            numToName.put(i, name);
            nameToNum.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String Pname = sc.next();
            if (Character.isDigit(Pname.charAt(0))) {
                int num = Integer.parseInt(Pname);
                System.out.println(numToName.get(num));
            } else {
                System.out.println(nameToNum.get(Pname));
            }
        }

        sc.close();
    }
}
