    //класс Car c приватными полями
public class Car {
    private String brand;
    private int age;
    private double price;
    private boolean isElectric;

    //Первый конструктор:
    public Car(String brand,int age,double price) {
        this.brand = brand;
        this.age = age;
        this.price = price;
    }
    //Второй конструктор:
    public Car(String brand,int age,double price,boolean isElectric) {
        this.brand = brand;
        this.age = age;
        this.price = price;
        this.isElectric = isElectric;
    }

    // Аксессоры для полей:

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge(){return age;}
    public void setAge(int age) { this.age = age;}

    public double getPrice(){return price;}
    public void setPrice(double price){ this.price = price;}

    public boolean isElectric (){return isElectric;}
    public void setElectric (boolean Electric){isElectric = Electric;}

}
