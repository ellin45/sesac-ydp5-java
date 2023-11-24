package _05_class._access_modifier._pack05;

public class Computer2 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("아이맥",250000,"Apple");
        Computer computer2 = new Computer("아이맥",250000,"Apple");
        Computer computer3 = new Computer("아이맥",250000,"Apple");

        computer1.setName("윈도우");
        computer2.setPrice(3000000);
        computer3.setCompany("Window");

        System.out.printf("이름은 %s, 가격은 %d, 회사는 %s", computer1.getName(), computer1.getPrice(), computer1.getCompany());
    }
}
