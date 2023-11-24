package _05_class._access_modifier._pack05;

public class SingletonEx {
    public static void main(String[] args) {
//   생성자의 접근 제한자가 private이기 때문에 다른 클래스에서 접근
//        Singleton s1 = new Singleton();

        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        if(s2 == s3){
            System.out.println("s2와 s3는 같은 참조를 가지므로 같은 객체를 참조");
        }else {
            System.out.println("s2와 s3는 다른 참조를 가지므로 다른 객체를 참조");
        }

        System.out.println(s2);
        System.out.println(s3);

    }
}
