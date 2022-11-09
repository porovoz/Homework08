

public class Main {
    public static void main(String[] args) {
        // homework 08 started

        // task 1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        float[] array1 = {1.57f, 7.654f, 9.986f};

        int[] array2 = {5, 3, 8};

        // task 2
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else
                System.out.println(array[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array1[i] + ", ");
            } else
                System.out.println(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array2[i] + ", ");
            } else
                System.out.println(array2[i]);
        }

        // task 3
        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + ", ");
            } else
                System.out.println(array[i]);
        }
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else
                System.out.println(array1[i]);
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array2[i] + ", ");
            } else
                System.out.println(array2[i]);
        }

        // task 4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
            if (i == array.length - 1) {
                System.out.print(array[i] + " ");
            } else
                System.out.print(array[i] + ", ");
        }
    }
}