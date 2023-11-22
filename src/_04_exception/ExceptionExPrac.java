package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionExPrac {

    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4};
            for(int i = 0; i < 5; i++){
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 범위를 벗어났습니다");
        }finally{
            System.out.println("연산 끝");
        }
    }
}
