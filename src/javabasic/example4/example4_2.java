package javabasic.example4;

import java.util.Scanner;

public class example4_2 {
    public static void main(String[] args) {
        //사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음, 평균 점수를 계산하여 출력하세요.
        int[] scores = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("5명의 점수를 입력해주세요: ");

        for(int i=0; i<5; i++){
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        System.out.printf("평균 점수: %d", sum/5);
    }
}
