package TerminalLib;

import java.util.Scanner;

public class TopUpBalance  {
    int amount;
    public TopUpBalance(){
        this.amount = 0;
    }
    public int UpBalance(){
        DataMoney data = new DataMoney();
        Scanner console = new Scanner(System.in);
        System.out.println("Для пополнения счета ведите сумму кратную 100");
        try {
            String st = console.nextLine();
            amount = Integer.parseInt(String.valueOf(st));

            if ((amount % 100) != 0){
                System.out.println("Введена сумма не кратная 100");
                return 0;
            }
            else {
                data.balance = data.balance + amount;
                System.out.println("Счет пополнен");
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
