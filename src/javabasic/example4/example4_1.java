package javabasic.example4;

import java.util.Arrays;

public class example4_1 {
    public static void main(String[] args) {
        //10개의 정수 값을 저장할 수 있는 배열을 생성하고, 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
        int[] array = new int[10];

        for(int i=1; i<=10; i++){
            array[i-1] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
