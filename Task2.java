import java.util.Scanner;

/**
 * Created by oshvager on 11/29/2022.
 */

public class Task2 {
    /*Реализовать код для расчета количества возможных маршрутов для доставки N клиентам.
Использовать конструкцию do while и понятие факториала*/

    public static void main(String[] args) {

        int rout = 1;

        //creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        //accepting a number from the user
        System.out.println("Enter a number of clients: ");
        int clients = sc.nextInt();

        do {
            rout *= clients--;

        } while( clients>0 );

        //printing the result
        System.out.println("Number of routs are: " + rout);
    }
}

