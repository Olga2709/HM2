import java.io.IOException;
import java.util.Scanner;

/**
 * Created by oshvager on 11/29/2022.
 */

 /*.Реализовать программу которая будет выводить размер в байтах в зависимости от суффикса,
        используя конструкцию switch-case.
Доступно 3 суффикса: K(килобайты),M(мегабайты),G(гигабайты).
Например на вход подается строка 1K. После преобразований вывод должен быть "1024 bytes".*/


public class Task1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size to convert into bytes: ");
        String size = scanner.nextLine();
        System.out.print("Enter number to convert into bytes: ");
        int number = scanner.nextInt();

        switch (size) {
            case "K":
                System.out.println(number +" kilobytes equals to  " + (number *1024) + " bytes");
                break;
            case "M":
                System.out.println(number + " megabytes equals to  " + (number * 1048576) + " bytes");
                break;
            case "G":
                System.out.println(number + " gigabytes equals to  " + (number * 1073741824) + " bytes");
                break;
            default:
                System.out.println("Incorrect size entered try again. Use: G for gigabytes, M for megabytes anf K for kilobytes");
        }





    }
}
