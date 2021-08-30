//package terminal.out.src.TimerDelay;
import PinCode.*;
import TerminalLib.*;

//import java.util.Date;

public class Terminal {

    public static void main(String[] args) {
        DataMoney data = new DataMoney();
        PinCode pinCode = new PinCode();
        GetCash getCash = new GetCash();
        TopUpBalance topUpBalance = new TopUpBalance();
        ShowBalance ShowBalance = new ShowBalance();
        SelectOperation selectOperation = new SelectOperation();

        pinCode.Enter();
        int Operation = selectOperation.Select();
        while(true) {
            switch (Operation) {
                case 0: {
                    Operation = selectOperation.Select();
                    break;
                }
                case 1: {
                    if(getCash.get() == 1){Operation = 0;}
                    break;
                }
                case 2: {
                    if(topUpBalance.UpBalance() == 1){Operation = 0;}
                    break;
                }
                case 3: {
                    if(ShowBalance.Balance() == 1){Operation = 0;}
                    break;
                }
            }
        }
    }
}
