package javabasic.example3;

import java.util.Scanner;

public class example3_3 {
    public static void main(String[] args) {
        //사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.

        int sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("n을 입력해주세요: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.printf("1~%d까지의 합은 %d입니다.", n, sum);
    }
}
