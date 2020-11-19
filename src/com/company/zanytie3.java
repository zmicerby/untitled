package com.company;

import java.util.Arrays;

public class zanytie3 {
    public static void main(String[] args) {

        int[] array = {1, 5, 0, 3, 2};

        int length = array.length;

        System.out.println(array[0]);
        System.out.println(length);
        int size = 50;
        int[] array2 = new int[size];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = size - i;

        }
        System.out.println(array2);
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        for (int i : array) {
            System.out.println(i + " ");
        }

        String[] stringArray = {"one", "two", "three"};
        for (String s : stringArray) {
            System.out.println(s);
        }

        String[][] dArray = new String[3][];
        System.out.println(dArray[0]);
        dArray[0] = new String[]{"one", "two"};
        System.out.println(dArray[0][1]);


        dArray = new String[][]{
                new String[]{"one", "two", "tree"},
                new String[]{"four"},
                new String[]{"five", "six"}
        };
        for(int i=0;i<dArray.length;i++){
            for(int j=0;j<dArray[i].length;j++){
                System.out.println(dArray[i][j]+"");
            }
            System.out.println();
        }

        for(String[] strings : dArray){
            for(String s : strings){
                System.out.print(s+" ");
            }
            System.out.println();
        }

    }
}
