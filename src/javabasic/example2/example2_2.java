package javabasic.example2;

import java.util.Arrays;
import java.util.Scanner;

public class example2_2 {
    public static void main(String[] args) {
        //세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
        
        int tmp= 0;
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("세 개의 수를 입력하시오: ");
        
        for(int i=0; i<3; i++){
            array[i] = sc.nextInt();
        }

        int min, max;
        // Select Sort
//        for(int i=0; i<3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                if (array[i] > array[j]) {
//                    tmp = array[i];
//                    array[i] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
        Arrays.sort(array); // DualQuickSort

        min = array[0];
        max = array[2];
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);
    }
}
