package Calculator3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double a = sc.nextDouble();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        System.out.print("두 번째 숫자를 입력하세요: ");
        double b = sc.nextDouble();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        System.out.print("사칙연산 기호를 입력하세요: ");
        String oper= sc.next();
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

        if(oper.equals("+")){
            result = a+b;
        }
        else if(oper.equals("-")){
            result = a-b;
        }
        else if(oper.equals("*")){
            result = a*b;
        }
        else if(oper.equals("/")){
            result = a/b;
        }

        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/

        System.out.println("결과: " + result);

    }
}