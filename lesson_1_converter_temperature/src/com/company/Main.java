package com.company;
import java.util.Scanner;
public class Main {
    /*
     Градусы по Фаренгейту = (градусы по Цельсию x 1.8) + 32
    Соответственно, из 'F в 'C можно перевести по следующей формуле:
    Градусы по Цельсию = (градусы по Фаренгейту - 32) / 1.8
     */
    public static void main(String[] args){
        double C;
        double F;
        System.out.println("Введите значение в градусак Цельсия");
        C  = new Scanner(System.in).nextInt();
        F = C * 1.8 + 32;
        System.out.print( C + "C" + " = " + F + "F");

    }
}
