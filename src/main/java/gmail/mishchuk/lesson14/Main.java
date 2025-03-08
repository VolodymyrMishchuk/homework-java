package gmail.mishchuk.lesson14;

import gmail.mishchuk.lesson14.quasiAnimals.Dragon;

public class Main {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setName("Drago_1");
        dragon.setAge(20);
        dragon.setWeight(108.9);

        System.out.println(dragon.getName());
        System.out.println(dragon.getAge());
        System.out.println(dragon.getWeight());

        Dragon dragon2 = new Dragon("Drago_2", 15, 97.5);
        System.out.println(dragon2.toString());
    }
}
