package javabasic.example2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
//        1.사용자로부터 두 개의 숫자를 입력받아, 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.

        Double left, right;
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하시오: ");
        left = sc.nextDouble();
        right = sc.nextDouble();

        System.out.printf("%f + %f = %f\n", left, right, left + right);
        System.out.printf("%f - %f = %f\n", left, right, left - right);
        System.out.printf("%f * %f = %f\n", left, right, left * right);

        if(right == 0){
            System.out.println("0으로 나눌 수 없습니다.");

        }
        else {
            System.out.printf("%f / %f = %f\n", left, right, left / right);
            System.out.printf("%f %% %f = %f\n", left, right, left % right);
        }
    }
}
