package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해주세요");
        while (true) {
            int number = sc.nextInt();
            try {
                int[] arr = {};
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("평균은 : " );
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스가 범위를 벗어났습니다");
            } finally {
                System.out.println("연산 끝");
            }
        }
    }
}
//public static int average(int a, int b){
//
//        }
//    }
//}
