
package onpu;
import java.util.*;



public class Fast {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args ) {

        int yourArray[];
        System.out.print("Enter size of array: ");
        int n = scan.nextInt();
        yourArray = new int [n];
        for (int i = 0; i < yourArray.length; i++)
            yourArray[i] = (int) ( Math.random() * n);

        System.out.print("\nOriginal array: [ ");
        for (int i: yourArray)
            System.out.print(i + " ");
        System.out.print("]");

        long startTime = System.nanoTime();
        sort(yourArray, n);
        long estimatedTime = System.nanoTime() - startTime;

        System.out.print("\n     New array: [ ");

        for (int i: yourArray) {
            System.out.print(i+" ");
        }

        System.out.print("]");

        System.out.println("\n\nTime of sort: " + (startTime - estimatedTime ));
    }

    private static void sort(int[] yourArray, int n) {
        int startIndex = 0;
        int endIndex = yourArray.length-1;
        swap(yourArray, startIndex, endIndex, n);
    }

    private static void swap(int [] yourArray, int start, int end, int n) {

        if (start >= end)
            return;


        int i = start,
            j = end,
            p = i - (i - j) / 2;

        while (i < j) {
            while (i < p && (yourArray[i] <= yourArray[p])) {
                i++;
            }
            while (j > p && (yourArray[p] <= yourArray[j])) {
                j--;
            }
            if (i < j) {
                int temp = yourArray[i];
                yourArray[i] = yourArray[j];
                yourArray[j] = temp;
                if (i == p)
                    p = j;
                else if (j == p)
                    p = i;
            }
            swap(yourArray, start, p, n);
            swap(yourArray, p + 1, end, n);
        }
    }
}

/*
*
* Вывод:
* Скорость работы алгоритма не зависит от размерности массива, а зависит от расположения его элементов.
* Чем они более хаотично разбросаны тем больше нужно времени для его обработки.
*
*/