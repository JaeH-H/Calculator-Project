package com.example.calculator;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a;
    int b;
    double val = 0;

    String c;
    char d;


    while(true) {

            System.out.print("숫자를 입력하세요. : ");
                a = scanner.nextInt();

            System.out.print("기호를 입력하세요. : ");
                c = scanner.next();
                d = c.charAt(0);

            System.out.print("숫자를 입력하세요. : ");
                b = scanner.nextInt();

            if (d== '/' && b == 0) {
                System.out.println("잘못된 값입니다.");

            } else if (d == '+') {
                val = a + b;
            } else if (d == '-') {
                val = a - b;
            } else if (d == '*') {
                val = a * b;
            } else if (d == '/') {
                val = a / b;
            } else{
                //사칙연산의 기호가 아닌 다른 것이 입력되면 "error"가 출력되고 return;이 실행되면 값을 반환하고 실행이 멈춘다.
                System.out.println("error");

            }
            System.out.println(val);
            System.out.println("종료하려면 exit를 입력하세요.");
            System.out.println("계속 진행하려면 아무거나 입력하세요.");
            c = scanner.next();



            if(c.equals("exit")) {
                break;
            }

    }
    }
}

