import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in); //Сканер стоимости билета
        System.out.println("Введите стоимость билета:");

        int ticketPrice = tp.nextInt(); //Стоимость биллета

        Scanner not = new Scanner(System.in); //Сканер количества билетов
        System.out.println("Количество биллетов:");

        int numberOfTickets = not.nextInt(); // Количество билетов

        int costPerMile = 20; // Стоимость 1 мили
        int formula = (ticketPrice * numberOfTickets) / costPerMile;

        System.out.println("Количество миль = " + formula);
    }
}