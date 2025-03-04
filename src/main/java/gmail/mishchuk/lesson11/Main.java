package gmail.mishchuk.lesson11;

public class Main {
    public static void main(String[] args) {

        int numDayOfWeek = (int)(Math.random() * 8);

        var result = switch(numDayOfWeek) {
            case 1 -> "Понеділок";
            case 2 -> "Вівторок";
            case 3 -> "Середа";
            case 4 -> "Четвер";
            case 5 -> "П'ятниця";
            case 6 -> "Субота";
            case 7 -> "Неділя";
            default -> "хз, як так вийшло";
        };

        System.out.println(result);
    }
}
