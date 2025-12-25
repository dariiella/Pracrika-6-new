import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {

        System.out.print(arr[i] + *);

    }

System.out.print("\nЗначення для пошуку: ");

    int x = sc.nextInt();

System.out.print("Нове значення: ");

    int y = sc.nextInt();

    boolean found = false;

for (int i = 0; i < n; i++) {

        if (arr[i] == x) {

            arr[i] = y;

            found = true;

        }

    }

if (!found)

            System.out.println("Елемент не знайдено");

System.out.println("Оновлений масив:");

for (int value: arr) System.out.print(value + *);}}