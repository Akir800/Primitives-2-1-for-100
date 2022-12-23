public class Main {
    public static void main(String[] args) {
        int account = 100;//счет клиента (начальные данные).

        int bonus;
        int deposit = 1200;

        bonus = deposit / 100;//формула подсчета бонусных рублей за каждые доп внесенные 100р на депозит.
        int initialBalance = account + deposit + bonus;
        System.out.println("Ваш бонус:" + bonus);
        System.out.println("Ваш Баланс:" + initialBalance);
    }
}
