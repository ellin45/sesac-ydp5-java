package _03_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPrac {

    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("문자를 입력해주세요");
            String texts = scan.nextLine();
            if (texts.equals("exit")) {
                run = false;
            }else if(!texts.equals("exit")){
                arr1.add(texts);
            }
        }
        for(String arr: arr1){
            System.out.println(arr);
        }
    }


}
