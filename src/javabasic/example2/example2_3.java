package javabasic.example2;

import java.util.Scanner;

public class example2_3 {
    public static void main(String[] args) {
        //&&, ||, ! 연산자를 사용하여 논리 연산을 수행하는 예제를 작성하세요.
        // boolean 변수를 입력받아서 AND, OR, NOT 연산 만들기.

        final boolean T = true;
        final boolean F = false;

        String ans_1, ans_2;
        boolean and, or;
        boolean ans_bool_1 = T, ans_bool_2 = T;
        boolean not_ans_1, not_ans_2;

        Scanner sc = new Scanner(System.in);
        System.out.println("두 boolean 타입을 입력해주세요(t or f): ");
        ans_1 = sc.next().toLowerCase();
        ans_2 = sc.next().toLowerCase();

        if(ans_1.equals("t")){
            ans_bool_1 = T;
        }
        else if(ans_1.equals("f")){
            ans_bool_1 = F;
        }
        if(ans_2.equals("t")){
            ans_bool_2 = T;
        }
        else if(ans_2.equals("f")){
            ans_bool_2 = F;
        }
        and = ans_bool_1 && ans_bool_2;
        or = ans_bool_1 || ans_bool_2;
        not_ans_1 = !ans_bool_1;
        not_ans_2 = !ans_bool_2;

        System.out.println("and연산(&&): "+ and);
        System.out.println("or연산(||): "+ or);
        System.out.println("!ans_1연산(!): "+ not_ans_1);
        System.out.println("!ans_2연산(!): "+ not_ans_2);
    }
}
