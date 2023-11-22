package _02_control_statement;
import java.util.Scanner;
public class methodOverloadingpractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        methodOverloadingpractice calc = new methodOverloadingpractice();
        calc.shape(3,4,5);



    }
    public static boolean shape(int r,int x, int y){
        System.out.println("반지름이 "+r+"인 원의 넓이 : " + r*r*Math.PI);
        System.out.println("가로 "+ x +" 세로 "+ y +" 인 직사각형의 넓이 : " + x*y);
        System.out.println("밑변 "+ x +" 높이 "+ y +" 인 삼각형의 넓이 : " + (x*y)/2);
        return true;
    }
}
