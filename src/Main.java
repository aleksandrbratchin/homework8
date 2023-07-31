import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("\nЗадача 1");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, true, false};
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, true, false};

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i])
            ;
            if (i + 1 != ints.length) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i + 1 != doubles.length) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i + 1 != booleans.length) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, true, false};

        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = booleans.length - 1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i]++;
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}