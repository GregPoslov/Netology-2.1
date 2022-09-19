import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in); //Сканер стоимости билета
        System.out.println("Введите стоимость билета:");

        int ticket_price = tp.nextInt(); //Стоимость биллета

        Scanner not = new Scanner(System.in); //Сканер количества билетов
        System.out.println("Количество биллетов:");

        int number_of_tickets = not.nextInt(); // Количество билетов

        int cost_per_mile = 20; // Стоимость 1 мили
        int formula = (ticket_price * number_of_tickets) / cost_per_mile;

        System.out.println("Количество миль = " + formula);
    }
}