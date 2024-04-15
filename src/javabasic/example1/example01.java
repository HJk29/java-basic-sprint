package javabasic.example1;

import java.util.Arrays;
import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        //TODO: 이름, 나이 오류 분기 나누기, 메소드 2개 만들기.

        Scanner sc = new Scanner(System.in);
        boolean nameTrue = true;
        boolean ageTrue = true;


        // 이름 입력받기 + 유효값 설정(이름에 숫자가 있는 경우)
        System.out.printf("이름: ");
        String name = sc.next();
        nameTrue = nameIsTrue(name);

        // 나이 입력받기 + 유효값 설정(나이에 숫자가 없는 경우)
        System.out.printf("나이: ");
        String age = sc.next();
        ageTrue = ageIsTrue(age);


        //유효할 때
        if (nameTrue && ageTrue) {
            System.out.printf("이름: %s\n나이: %s", name, age);
        }
        //유효하지 않을 때
        else if (!nameTrue && !ageTrue) {
            System.out.println("이름과 나이를 잘못 입력하셨습니다. 종료합니다.");
        } else if (!nameTrue) {
            System.out.println("이름을 잘못 입력하셨습니다. 종료합니다.");
        } else if (!ageTrue) {
            System.out.println("나이를 잘못 입력하셨습니다. 종료합니다.");
        }
    }


    public static boolean nameIsTrue(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean ageIsTrue(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!(Character.isDigit(str.charAt(i)))) {
                return false;
            } else if (str.charAt(i) == '.') {
                return false;
            }
        }
        return true;
    }
}

