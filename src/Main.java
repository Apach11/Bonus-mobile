public class Main {
    public static void main(String[] args) {
        int amount = 1300;
        int x = 1000;
        int i = 100;
        int y = 300;
        int bonus;

        if (amount >= 1000) {
            bonus = amount / i;
        } else {
            bonus = 0;
        }

        System.out.println("Бонус " + (y + x) / i);
    }
}