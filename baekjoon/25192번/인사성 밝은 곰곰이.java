import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// import java.util.ArrayList;
// import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); //채팅방 기록수
        int count = 0;
        HashSet List = new HashSet();

        for(int i=0; i<N; i++){
            String chat = br.readLine();

            if(chat.equals("ENTER")){
                count += List.size();
                List = new HashSet();
            }else {
                List.add(chat);
            }
        }
        count += List.size();

        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}