package gmail.mishchuk.lesson14_dragons.quasiAnimals;

import java.util.Objects;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private TypeOfDragons typeOfDragons;

    public Dragon() {
        System.out.println("Створено невідомого дракона");
    }

    public Dragon(String name, int age, double weight, TypeOfDragons typeOfDragons) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.typeOfDragons = typeOfDragons;
        System.out.println("Створено повноцінного дракона");
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfDragons getTypeOfDragons() {
        return typeOfDragons;
    }

    public void setTypeOfDragons(TypeOfDragons typeOfDragons) {
        this.typeOfDragons = typeOfDragons;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return age == dragon.age && Double.compare(weight, dragon.weight) == 0 && typeOfDragons == dragon.typeOfDragons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight, typeOfDragons);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", TypeOfDragons=" + typeOfDragons +
                '}';
    }
}
