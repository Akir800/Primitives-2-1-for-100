public class Main {
    public static void main(String[] args) {
        int score = 100;//счет клиента (начальные данные).

        int bonus;
        int deposit = 10000;

        if (deposit >= 10000) {
            bonus = deposit / 100;//формула подсчета бонусных рублей за каждые доп внесенные 100р на депозит.
        } else {
            bonus = 0;
        }
        int balance = score + deposit + bonus;
        System.out.println("Ваш бонус:" + bonus);
        System.out.println("Ваш Баланс:" + balance);
    }
}
