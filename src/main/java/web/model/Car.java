package web.model;

public class Car {
    private String brand;
    private String color;
    private int count;

    public Car(String brand, String color, int count) {
        this.brand = brand;
        this.color = color;
        this.count = count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", web.model='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}
