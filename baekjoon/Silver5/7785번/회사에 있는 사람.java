import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(); // 출입 기록의 수

        HashSet<String> inout = new HashSet<String>(); // 출입 기록 내 이름을 저장 할 리스트 선언

        for(int i=0; i<n; i++){
            String name = input.next(); //이름
            String state = input.next(); // 상태

            if(state.equals("enter")){ //enter인 경우 이름 저장
                inout.add(name);
            }else if(state.equals("leave")){ //leave인 경우
                if(inout.contains(name)){ //이름이 있다면
                    inout.remove(name); // 이름 제거
                }
            }
        }
        input.close();

        ArrayList<String> arr= new ArrayList<String>(inout); //리스트에 옮겨담음
        Collections.sort(arr, Collections.reverseOrder()); // 졍렬 이후 역순 정렬
        for(String name : arr){
            System.out.println(name);
        }
        

    }
}