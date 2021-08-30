package TerminalLib;

import java.util.Scanner;

public class GetCash {
    int amount;
    public GetCash(){
        this.amount = 0;
    }
    public int get(){
        DataMoney data = new DataMoney();
        Scanner console = new Scanner(System.in);
        System.out.println("Баланс " + data.balance + "\nВведите сумму для выдачи денег кратную 100");
        try {
            String st = console.nextLine();
            amount = Integer.parseInt(String.valueOf(st));

            if ((amount % 100) != 0){
                System.out.println("Введена сумма не кратная 100");
                return 0;
            }
            else
                if(data.balance >= amount){
                    data.balance = data.balance - amount;
                }
                else {
                    System.out.println("Сумма на счете меньше запрашиваемой");
                    return 0;
                }
        }
        catch (NumberFormatException e) {
            System.out.println("Введен не цифровой символ.");
            return 0;
        }
        /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введено более одного символа.");
            return 0;
        }*/
        catch (ArithmeticException e) {
            System.out.println("Введена сумма превышающая 2 147 483 600");
            return 0;
        }
        System.out.println("Ожидайте выдачи денег\n");
        return 1;
    }

}
