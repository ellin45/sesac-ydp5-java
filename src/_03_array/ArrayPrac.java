package _03_array;
import java.util.Scanner;
public class ArrayPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum1 = 0;
        for (int num : numbers) {
            sum1 += num;
        }

        double avg1 = (double) sum1 / 5;
        System.out.println("평균은 " + avg1);
    }
}