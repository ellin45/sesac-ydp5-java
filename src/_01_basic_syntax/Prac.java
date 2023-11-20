package _01_basic_syntax;
import java.util.Scanner;
public class Prac {

    static  Scanner scan = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println(("이름을 입력하세요"));
        String name = scan.next();
        System.out.println(("나이을 입력하세요"));
        int age = scan.nextInt();
        System.out.println("안녕하세요! " + name + "님"+ "("+ age + "세)");

        scan.close();
    }
}
