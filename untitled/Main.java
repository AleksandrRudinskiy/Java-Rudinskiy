import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int res = scanner.nextInt();

            switch (res) {
                case 1:
                    System.out.println("Введите число");
                    int count = scanner.nextInt();
                    Count.sayHi(count);
                    break;
                case 2:
                    System.out.println("Введите имя");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    Line.makeHi(name);
                    break;
                case 3:
                    System.out.println("Введите количество чисел");
                    int n = scanner.nextInt();
                    System.out.println("Введите числа через пробел");
                    List<Integer> list = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        list.add(scanner.nextInt());
                    }
                    System.out.println("Числа, кратные 3:");
                    CountArray.findCounts(list).forEach(System.out::println);
                case 0:
                    return;
            }
        }
    }

    static void printMenu() {
        System.out.println("Какой алгоритм хотите выполнить?");
        System.out.println("1 - Cравнить число");
        System.out.println("2 - Сравнить имя");
        System.out.println("3 - Вывести кратные числа из массива");
        System.out.println("0 - Выход из приложения");
    }
}
