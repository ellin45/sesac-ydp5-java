// 메인 클래스 (시작 클래스) 정의
// - main 메서드 가짐
// - 메인 클래스는 한개! (Node에서 진입점 파일 역살)
public class Main {
//    주석
// 1. // 한줄
// 2. /* 여러 줄*/
// 3. /** 문서 주석 **/

//    main 메소드
//    - 자바 응용 프로그램의 실행 시작점
//    - 어플리케이션이 실행되려면 최소 1개 존재해야함
//     -JVM은 세미콜론(;)으로 끝나는 문장을 하나의 명령문으로 인식
    public static void main(String[] args) {
        System.out.printf("Java Study Start");
        System.out.println("Yeah");
        System.out.println("Hello and welcome!");
        System.out.printf("이름을 입력하세요");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
            return;
        }
    }
}

