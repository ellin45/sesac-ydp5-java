package _05_class._access_modifier._final;

public class ConstEx {

    public static void main(String[] args) {
        //상수 읽기
        //static 필드이므로 객체 생성없이 클래스명, 필드명으로 바로 접근
        System.out.println(Const.MAX_VALUE);
        System.out.println(Const.GREETING);


//        Const.MAX_VALUE = 100001;
//        Const.GREETING= "Hello, Java!";
//
    }
}
