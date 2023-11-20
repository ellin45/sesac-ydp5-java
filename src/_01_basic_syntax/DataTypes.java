package _01_basic_syntax;

//Primitive Type
// - 비객체 타입 -> null 값 가질 수 없음

//Reference Type
// - java.lang. Object 상속
// - 기본형이 아니면 참조형
public class DataTypes {
    public static void main(String[] args) {
    System.out.println("=== Primitive Type ( 기본형) ====");

//    정수형 변수
        int x = 10;
        long y = 1000000000000L; // long 타입은 뒤에 L, l 붙어야함
        short z = 32767;
        byte b = 127;

//      실수형 변수
        float a = 3.14f; // float 타입은 뒤에 F, f 붙여야함
        double c = 2.71828;

//      문자형 변수 선언
//      - 유니코드 저장
        char ch = 'A';
        char ch2 = '가';

//        논리형 변수
        boolean bool = true;
        boolean bool2 = false;

//      변수 출력
        System.out.println("정수형 변수 : " + x + " ," + y + "," + z + "," + b) ;
        System.out.println("실수형 변수 : " + a + " ," + c) ;
        System.out.println("문자형 변수 : " + ch + " ," + ch2) ;
        System.out.println("논리형 변수 : " + bool + " ," + bool2) ;

        System.out.println("==== Reference Type (참조형) ====" );

//       String 참조형 변수
//       -Java에서 String 타입은 특별함 . 참조형인데 기본형처럼 사용함
//        - 기본 자료형은 == 연산자를 통해 비교하지만, string 객체간 비교는 .equals() 메서드 사용
        String gretting = "Hello, World!";

//       배열 (Array)
        int[] numbers = {1,2,3,4,5};

//       클래스 (Class)
        Person person = new Person("John", 30);

//    출력
        System.out.println();
        System.out.println("Person 객체 : " + person.getName() + "," + person.getAge());

    }
}

// 임의의 클래스 정의 (추후 배울 예정)
class Person {
    // 필드 (속성)
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}