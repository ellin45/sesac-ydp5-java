package _02_control_statement;
import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        if (age < 8 && age > 1) {
            System.out.println("유아");
        } else if (age > 7 && age < 14) {
            System.out.println("초등학생");
        } else if (age > 13 && age < 17) {
            System.out.println("중학생");
        } else if (age > 18 && age < 20) {
            System.out.println("고등학생");
        } else if (age > 20) {
            System.out.println("성인");
        }
    }
}
