package _03_array;
// 표준 배열
// 배열
// - 배열에 저장할 자료형 선언 => 배열 이름, 크기 선언
// - 배열 원소는 모두 같은 타입
// - 처음 선언한 배열 크기 변경 불가능
public class ArrayEx {

    public static void main(String[] args) {
        // 배열 변수 선언
        // - 두가지 방법이 있으나 관례적으로는 전자 많이 씀
        // 1.타입[] 변수;
        // 2.타입 변수[]
        int[] arr1;
        int arr2[];

        // - 배열 변수 '참조', null 초기화 가능
        // ex. 타입[]변수=null; 가능
        // => 배열 변수가 null 값을 가진 상태에서 인덱싱: NullPointerException
        String[] temp=null;
        System.out.println(temp); //null
        //System.out.println(temp[2]); //Error

        // - 값 목록으로 배열 변수 선언/생성
        int[] intArr= {19,28,483,59,39};
        System.out.println("intArr[0]: "+intArr[0]);
        System.out.println("intArr[1]: "+intArr[1]);
        System.out.println(intArr); //참조값 출력, 원소 x

        intArr[1]=77;
        System.out.println("intArr[1]: "+intArr[1]);

        // - 배열 변수 선언, 대입 시점 다르다면
        // "new 타입[]"을 중괄호 앞에 붙여야 함
        char[] charArr;
//      charArr= {"a","b","c"};
        charArr=new char[]{'a','b','c'};

        // - new 연산자로 배열 선언/생성
        // : 배열 원소 값은 기본 값으로 초기화 됨
        double[] doubleArr=new double[3];
        System.out.println(doubleArr[0]); //double:0.0
        doubleArr[0]=0.1;
        doubleArr[1]=0.2;
        doubleArr[2]=0.3;
        System.out.println(doubleArr[0]);
        System.out.println(doubleArr[1]);
        System.out.println(doubleArr[2]);

        ////////////
        //배열 길이
        // - 배열변수.length;
        System.out.println(doubleArr.length);
//      doubleArr.length=4; //Error: length 필드는 수정 불가. 읽기 전용

        // ex. 총합,평균
        int sum=0;
        for(int i=0; i<intArr.length; i++) {
            sum+=intArr[i];
        }
        System.out.println(sum);
        double avg=(double)sum/intArr.length; //형 변환
        System.out.println(avg);
//      System.out.println(doubleArr[doubleArr.length]);

        // 배열 출력
        // - toString():배열 내용을 문자열로 변환해서 출력
//      System.out.println(Arrays.toString(intArr));

/////////////////////
        // 다차원 배열
        // - 배열 안에 또 다른 배열이 존재하는 배열

        // 2*3 배열 생성/초기화
        int[][] matrix= {{1,2,3},{4,5,6} };
        System.out.println("matrix");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 3*2 배열 생성/초기화
        int[][] matrix2=new int[3][2];
        matrix2[0][0]=1;
        matrix2[0][1]=2;
        matrix2[1][0]=3;
        matrix2[1][1]=4;
        matrix2[2][0]=5;
        matrix2[2][1]=6;

        System.out.println("\nmatrix2");
        for(int i=0; i<matrix2.length; i++) {
            for(int j=0; j<matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }

        // 3차원 배열 생성/초기화
        int[][][] threeArr= {{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}} };

        System.out.println("\nthreeArr");
        for(int i=0; i<threeArr.length; i++) {
            for(int j=0; j<threeArr[i].length; j++) {
                for(int k=0; k<threeArr[i][j].length; k++) {
                    System.out.print(threeArr[i][j][k]);
                }
                System.out.println();
            }
        }

        ////////////////
        // 객체 참조 배열
        // - 기본 타입 배열 각 원소에 '값' 저장
        // - 참조 타입 배열 각 원소에 '참조(주소)' 저장
        String[] langs=new String[3];
        langs[0]="java";
        langs[1]="java";
        langs[2]=new String("java");
        System.out.println(langs[1]==langs[0]); //true: 같은 객체 참조
        System.out.println(langs[1]==langs[2]); // false: 다른 객체 참조

    }
}