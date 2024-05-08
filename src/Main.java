//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cash = 1100;
        int bonus = 0;
        if (cash > 1000) {
            bonus = cash / 100;
        }
        cash = cash + bonus;
        System.out.println("Баланс: " + cash);
        System.out.println("Бонус: " + bonus);

        /* Там у вас в задании написано, что при пополнении на 1100 рублей
           получается 11 бонусов и баланс должен быть 1211, хотя 1100 + 11 = 1111,
           поправьте пожалуйста.
         */

    }
}