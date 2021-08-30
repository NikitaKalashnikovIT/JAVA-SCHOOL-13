package com.company;

public class Main {

    public static void main(String[] args) {
        byte length = 10;
        int i, j;
        int tmp;
        int []myArray = {15,70,99,44,12,0,11,22,8,9,50};
        for (i = 0; i <= length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println();
        for (i = 0; i <= length; i++) {
            for (j = 1; j <= length; j++) {
                if (myArray[j] > myArray[j-1]) {
                    tmp = myArray[j];
                    myArray[j] = myArray[j-1];
                    myArray[j-1] = tmp;
                }
            }
        }
            for (i = 0; i <= length; i++) {
                System.out.print(myArray[i] + "\t");
            }
    }
}
