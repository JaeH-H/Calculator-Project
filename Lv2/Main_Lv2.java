package Lv2;

import java.util.Scanner;

public class Main_Lv2 {
    public static void main(String[] args) {


        Calculator_Lv2 cal = new Calculator_Lv2();
        Scanner sc = new Scanner(System.in);
        String ex;

        //연산 입력부분
        while (true) {

            System.out.print("숫자를 입력하세요. : ");
            double a = sc.nextDouble();
            cal.setNum1(a);
            System.out.print("기호를 입력하세요. : ");
            String c = sc.next();
            cal.setOperate(c);
            System.out.print("숫자를 입력하세요. : ");
            double b = sc.nextDouble();
            cal.setNum2(b);

            if (cal.getOperate().equals("/") && cal.getNum2() == 0) {
                System.out.println("잘못된 값입니다.");
                continue;
            }

            //Calculator_Lv2에서 연산
            cal.calculate();

            System.out.println("결과 : " + cal.getAns());
            System.out.println("저장 값 : " + cal.getAnswer().toString());

            //삭제 및 종료 부분
            System.out.println("첫번째 값을 삭제하시려면 \"삭제\"를 입력해주세요.");
            System.out.println("종료하려면 \"exit\"를 입력하세요.");
            ex = sc.next();

            if (ex.equals("exit")) {
                break;
            } else if (ex.equals("삭제")) {
                cal.setRemoveAnswer();
                System.out.println("삭제되었습니다.");
                System.out.println(cal.getAnswer().toString());
            } else {
                System.out.println("계산을 다시 시작합니다.");
            }

        }

    }
}
