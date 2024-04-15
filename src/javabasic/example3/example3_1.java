package javabasic.example3;

import java.util.Scanner;

public class example3_1 {
    public static void main(String[] args) {
        //사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
        //

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하시오: ");
        int digit = sc.nextInt();
        if(digit> 0) System.out.printf("%d는 양수입니다.", digit);
        else if(digit == 0) System.out.printf("%d는 0입니다.", digit);
        else System.out.printf("%d는 음수입니다.", digit);

    }
}
