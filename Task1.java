import java.io.IOException;
import java.util.Scanner;

/**
 * Created by oshvager on 11/29/2022.
 */

 /*.Реализовать программу которая будет выводить размер в байтах в зависимости от суффикса,
        используя конструкцию switch-case.
Доступно 3 суффикса: K(килобайты),M(мегабайты),G(гигабайты).
Например на вход подается строка 1K. После преобразований вывод должен быть "1024 bytes".*/

    /*1 байт = 8 бит
1 Кб (1 Килобайт) = 210 байт = 2*2*2*2*2*2*2*2*2*2 байт =
1024 байт (примерно 1 тысяча байт - 103 байт)
1 Мб (1 Мегабайт) = 220 байт = 1024 килобайт (примерно 1 миллион байт - 106 байт)
1 Гб (1 Гигабайт) = 230 байт = 1024 мегабайт (примерно 1 миллиард байт - 109 байт)
1 Тб (1 Терабайт) = 240 байт = 1024 гигабайт (примерно 1012 байт)
1 Пб (1 Петабайт) = 250 байт = 1024 терабайт (примерно 1015 байт)
1 Эксабайт = 260 байт = 1024 петабайт (примерно 1018 байт)
1 Зеттабайт = 270 байт = 1024 эксабайт (примерно 1021 байт)
1 Йоттабайт = 280 байт = 1024 зеттабайт (примерно 1024 байт)*
1 Мегабайт = 1048576 Байт
1 Гигабайт = 1073741824 Байт
1024
/
     */


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
