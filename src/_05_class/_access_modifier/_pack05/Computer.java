package _05_class._access_modifier._pack05;

public class Computer {
    private String name;
    public int price;
    public String company;

    public Computer(String name, int price, String company){
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
