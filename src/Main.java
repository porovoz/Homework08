import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // homework 08 started

        // task 1
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        float [] array1 = {1.57f, 7.654f, 9.986f};

        int [] array2 = {5, 3, 8};

        // task 2
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + "\n"
                + array1[0] + ", " + array1[1] + ", " + array1[2] + "\n"
                + array2[0] + ", " + array2[1] + ", " + array2[2]);
  //            for (int i = 0; i < array[0]; i++) {
  //          System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
  //          break;
  //      }
  //      for (int i = 0; i < array1[0]; i++) {
  //          System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
  //          break;
  //      }
  //      for (int i = 0; i < array2[0]; i++) {
  //          System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
  //          break;
  //      }

        // task 3
        System.out.println(array[2] + ", " + array[1] + ", " + array[0] + "\n"
                + array1[2] + ", " + array1[1] + ", " + array1[0] + "\n"
                + array2[2] + ", " + array2[1] + ", " + array2[0]);
  //                  for (int i = 0; i < array[0]; i++) {
  //                System.out.println(array[2] + ", " + array[1] + ", " + array[0]);
  //                break;
  //            }
  //            for (int i = 0; i < array1[0]; i++) {
  //                System.out.println(array1[2] + ", " + array1[1] + ", " + array1[0]);
  //                break;
  //            }
  //            for (int i = 0; i < array2[0]; i++) {
  //                System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
  //                break;
  //            }

        // task 4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
        }
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
        }
    }

