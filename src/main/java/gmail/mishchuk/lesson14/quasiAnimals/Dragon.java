package gmail.mishchuk.lesson14.quasiAnimals;

import java.sql.SQLOutput;

public class Dragon {

    private String name;
    private int age;
    private double weight;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("Створено повноцінного дракона");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
