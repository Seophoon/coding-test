import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        double jumsu = 0;
        double hap = 0;

        for(int i=0; i<20; i++){
            String name = input.next(); //전공과목 이름
            double suup = input.nextDouble(); //학점 (3학점짜리 수업 할때의 학점)
            String score = input.next(); //성적    
        
        switch(score){
            case "A+":
                jumsu += suup*4.5;
                hap += suup;
                break;
            case "A0":
                jumsu += suup*4.0;
                hap += suup;
                break;
             case "B+":
                jumsu += suup*3.5;
                hap += suup;
                break;
            case "B0":
                jumsu += suup*3.0;
                hap += suup;
                break;
            case "C+":
                jumsu += suup*2.5;
                hap += suup;
                break;
            case "C0":
                jumsu += suup*2.0;
                hap += suup;
                break;
            case "D+":
                jumsu += suup*1.5;
                hap += suup;
                break;
            case "D0":
                jumsu += suup*1.0;
                hap += suup;
                break;
            case "F":
                jumsu += suup*0.0;
                hap += suup;
                break;
            default:
                jumsu += 0;
                hap += 0;
            }
        }
        
        input.close();

        System.out.println(jumsu/hap);
    }
}