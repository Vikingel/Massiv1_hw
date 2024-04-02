import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv0 = new int[5]; //объявление переменной и выделение памяти для 5 целых чисел
        //массив уже заполнен 0
        int[] massiv1 = {12, 16, 13, -8, 7, 9};

        int[] m = inputArray();
        System.out.println("Сумма элементов = " + summaElementov(m));
        System.out.println("Максимальный элемент = " + maxElement(m));
        System.out.println("Минимальный элемент = " + minElement(m));
        System.out.println("Индекс максимального элемента = " + maxIndex(m));
        System.out.println("Индекс минимального элемента = " + minIndex(m));
        findIndexX(m);

        // printArray("массив0 содержит ", massiv0);
        // printArray("массив1 содержит ", massiv1);
        //printChangeMinMax(m);
        printReverse(m);
        // fillArray(massiv0, 193);
        // printArray("массив0 содержит ", massiv0);


//        printArray("массив2 содержит ", massiv2);

    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static void fillArray(int[] m, int filler) {
        for (int i = 0; i < m.length; i++) {
            m[i] = filler;
        }
    }

    public static void readArray(int[] m) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int value;
        int summa = 0;
        System.out.println("введите " + m.length + " элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }

    public static int summaElementov(int[] m) {
        int summa = 0;
        for (int i = 0; i < m.length; i++) {
            summa = summa + m[i];
        }
        return summa;
    }

    public static int maxElement(int[] m) {
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            if (max < m[i]) max = m[i];
        }
        return max;
    }

    public static int minElement(int[] m) {
        int min = m[0];
        for (int i = 1; i < m.length; i++) {
            if (min > m[i]) min = m[i];
        }
        return min;
    }

    public static int maxIndex(int[] m) {
        int max = m[0], j = 0;
        for (int i = 1; i < m.length; i++) {
            if (max < m[i]) {
                max = m[i];
                j = i;
            }
        }
        return j;
    }

    public static int minIndex(int[] m) {
        int min = m[0], k = 0;
        for (int i = 1; i < m.length; i++) {
            if (min > m[i]) {
                min = m[i];
                k = i;
            }
        }
        return k;
    }

    private static void printChangeMinMax(int[] m) {
        System.out.println("Массив примет вид:");
        int temp;
        int iMin = minIndex(m);
        int iMax = maxIndex(m);
        temp = m[iMin];
        m[iMin] = m[iMax];
        m[iMax] = temp;
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }

    private static void findIndexX(int[] m) {
        Scanner scanner = new Scanner(System.in);
        int p = -1;
        System.out.println("Введите элемент для поиска:");
        int x = scanner.nextInt();
        for (int i = 0; i < m.length; i++) {
            if (m[i] == x) {
                p = i;
            }
        }
        System.out.println("Индекс элемента "+x+" = "+p);
    }

    private static void printReverse(int[] m) {
        System.out.println("Массив в реверсии примет вид:");
        for (int i = m.length - 1; i >= 0; i--) {
            System.out.println(m[i]);
        }
    }
}