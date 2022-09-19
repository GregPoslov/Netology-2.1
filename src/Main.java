import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sx = new Scanner(System.in);
        System.out.println("Введите стоимость билета:");

        int x = sx.nextInt(); //Стоимость биллета

        Scanner sy = new Scanner(System.in);
        System.out.println("Количество биллетов:");

        int y = sy.nextInt(); // Количество билетов

        int i = 20; // Стоимость 1 мили
        int formula = (x * y) / i;

        System.out.println("Количество миль = " + formula);


    }
}