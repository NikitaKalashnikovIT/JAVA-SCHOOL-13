package PinCode;
import TimerDelay.*;
import java.util.Scanner;

public class PinCode {
    TimerDelay timerDelay = new TimerDelay();

    int pinVerification[] = new int[4];//Четыре значения пин-кода.
    int completionFlag ;//Флфг работы проверки пинкода.
    int cnrError ;//Количество попыток ввода пин-кода.
    int cnt;//Счетчик введенных чисел пин-кода.
    long timeDifference;//Изменение таймера при ожидании возможности ввода пин-кода, после.
    final int Number_PinCode_[] = new int[4];//Номер пин-кода.
    final int numberError;//Количество неудачных попыток ввода неверно пин-кода.
    final long delay;//Задержка в милисек.Задержка после (numberError) количество неудачных попыток ввода пин-кода

    public PinCode(){
        completionFlag = 0;
        cnrError = 0;
        numberError = 3;
        cnt = 0;
        timeDifference = 0;
        delay = 10000;
        Number_PinCode_[0] = 1;
        Number_PinCode_[1] = 2;
        Number_PinCode_[2] = 3;
        Number_PinCode_[3] = 4;
    }
    public void Enter() {
        System.out.println("Введите четырехзначный пин-код :");
        Scanner console = new Scanner(System.in);

        while (completionFlag == 0) {
            //Проверка флага работы таймера ожидания повторного ввода пин-кода.
            if (timerDelay.DelayMs() == 0) {
                //Чтение символов клавиатуры.
                String chPin = console.nextLine();
                char[] chArray = chPin.toCharArray();
                //Проверка нажатия Enter при отсутствующем символе.
                if (chArray.length != 0) {
                    //Введено более одного символа.
                   // if (chArray.length != 1) System.out.println("Все символы кроме первого не будут учтены.");
                    try {
                        //Проверка на ввод более одного символа(для намеренной генерации исключения)
                        char j [] = new char[1];
                        for(int i = 0;chArray.length > i;i++){ j[i] = chArray[i];}
                        //Конвертация из char в int.
                        pinVerification[cnt] = Integer.parseInt(String.valueOf(chArray[0]));
                        cnt++;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Введен не цифровой символ.");
                    }
                    catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Введено более одного символа.");
                    }
                    //Проверка пин-када.
                    if (pinVerification[0] == Number_PinCode_[0] && pinVerification[1] == Number_PinCode_[1] &&
                        pinVerification[2] == Number_PinCode_[2] && pinVerification[3] == Number_PinCode_[3]) {
                        System.out.println("Пинкод введен верно.   ");
                        completionFlag = 1;
                    } else if (cnt == 4) {
                        System.out.println("Пинкод введен не верно.");
                        cnrError++;
                        cnt = 0;
                        if (cnrError == 3) {
                            timerDelay.DelayMs(delay, true);
                            System.out.println("Блокировка аккаунта на 10 сек. ");
                            cnrError = 0;
                        }
                    } else {System.out.println("Введите очередной символ.");}
                } else {System.out.println("Введите цифровой символ");}
            } else {
                if (timerDelay.DelayMs() != timeDifference && timerDelay.DelayMs() != 0) {
                    timeDifference = timerDelay.DelayMs();
                    System.out.println("Осталось " + timeDifference + " секунды до возможности ввода пин-кода ");

                    if (timeDifference == 1) {
                        System.out.println("Введите четырехзначный пин-код :");
                    }
                }
            }
        }
    }
}

