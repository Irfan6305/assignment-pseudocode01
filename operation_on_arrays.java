
  
  package irfan_khan;

import java.util.Arrays;
import java.util.Scanner;

public class operation_on_arrays {
    public static int[] operation(int arr1[],int arr2[],String a) {
        int arr3[] = new int[arr1.length];
        if (arr1.length == arr2.length) {
            if (a == "+") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = (arr1[i]) + (arr2[i]);
                }
            }
            if (a == "-") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] - arr2[i];
                }
            }
            if (a == "*") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] * arr2[i];
                }
            }
            if (a == "/") {
                for (int i = 0; i < arr1.length; i++) {
                    arr3[i] = arr1[i] / arr2[i];
                }
            }

        } else {
            System.out.println("can not perform operation on these arrays");
        }
        return arr3;

    }


    


    