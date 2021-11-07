package TerminalLib;
import java.util.Scanner;

public class SelectOperation {
    int Operation;
    public SelectOperation(){
        Operation = 0;
    }

    public int Select(){
        Scanner console = new Scanner(System.in);
        System.out.println("Для снятия наличных введите  1");
        System.out.println("Для пополнения счета введите 2");
        System.out.println("Узнать баланс счета введите 3");

        try {
            String st = console.nextLine();
            char[] chArray = st.toCharArray();
            Operation = Integer.parseInt(String.valueOf(chArray[0]));
        }
        catch (NumberFormatException e) {
            System.out.println("Введен не цифровой символ.");
            return 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введено более одного символа.");
            return 0;
        }

        if(Operation >=1 && Operation <= 3)
        return Operation;
        else {
            System.out.println("Введена несуществующая команда");
            return 0;
        }
    }
}
