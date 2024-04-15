package javabasic.example4;

import java.util.Arrays;

public class example4_3 {
    public static void main(String[] args) {
        //주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
        int[] array = new int[]{3, 5, -1, 2, 10, 28};
        Arrays.sort(array); //배열 정렬
        System.out.printf("배열의 최댓값은 %d, 최솟값은 %d입니다.", array[0], array[array.length-1]);
    }
}
