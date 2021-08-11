public class Main {
    public static void main(String[] args) {
        /*
         Объявление переменных для входных данных и параметров программы:
         одна для хранения стоимости билета, другая для хранения количества
         рублей для одной бонусной милли
         */
        int ticketPrice = 5812;
        int amountForMile = 20;
        /*
         Рассчет количества бонусных милль, используя значения заведённых переменных.
         Ответ сохраняется в новой переменной и выводится на экран
        */
        int bonusMiles = ticketPrice / amountForMile;
        System.out.println("Начислено бонусных миль: " + bonusMiles);

    }
}
