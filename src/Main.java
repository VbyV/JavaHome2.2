public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int paid = 1100;
        int bonus;
        if (paid > 1000) {
            bonus = paid / 100;
        } else {
            bonus = 0;
        }
        int newBalance = balance + paid + bonus;
        System.out.println("Итоговый баланс:" + newBalance);
        System.out.println("Бонус: " + bonus);
    }
}
