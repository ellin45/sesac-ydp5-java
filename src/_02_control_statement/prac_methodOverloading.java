import java.util.Scanner;

public class prac_methodOverloading {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int firstNum= sc.nextInt();
        int secondNum= sc.nextInt();
        System.out.println("덧셈 결과 : " + add(firstNum, secondNum));
        System.out.println("뺄셈 결과 : " + minus(firstNum, secondNum));
        System.out.println("나눗셈 결과 : " + division(firstNum, secondNum));
        System.out.println("곱셈 결과 : " + mul(firstNum, secondNum));
    }

    public static double add(int a , int b) {
        return a + b;
    }

    public static double minus(int a , int b) {
        return a - b;
    }

    public static double division(int a , int b) {
        return a / b;
    }

    public static double mul(int a , int b) {
        return a * b;
    }

}