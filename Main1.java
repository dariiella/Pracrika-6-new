import java.util.Random;

public class Main1 {

    public static void main(String[] args) {

        int size = 10;

        int[] arr = new int[size];

        Random random = new Random();

        int even = 0, odd = 0;

        for (int i = 0; i < size; i++) {

            arr[i] = random.nextInt(bound: 100);

            System.out.print(arr[i] + *);

            if (arr[i] % 2 == 0) even++;

            else odd++;

        }

        System.out.println("\nПарних: + even);

                System.out.println("Henарних: + odd);

    }}