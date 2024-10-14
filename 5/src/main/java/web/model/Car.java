package web.model;

import org.springframework.context.annotation.Bean;

public class Car {
    private String mark;
    private int speed;
    private int price;

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка='" + mark + '\'' +
                ", Скорость=" + speed +
                ", Цена=" + price +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
