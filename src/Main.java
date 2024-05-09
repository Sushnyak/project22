//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int cash = 1100;
        int bonus = 0;
        if (cash > 1000) {
            bonus = cash / 100;
        }
        balans = balans + cash + bonus;
        cash = cash + bonus;
        System.out.println("Баланс: " + balans);
        System.out.println("Бонус: " + bonus);

    }
}