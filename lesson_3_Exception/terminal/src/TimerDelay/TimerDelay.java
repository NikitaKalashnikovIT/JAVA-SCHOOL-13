package TimerDelay;

public class TimerDelay {
    public  boolean status;
    private long timer_s ;
    private long timer_f ;
    public  long timer_d ;
    public TimerDelay(){
        this.status = false;
        this.timer_s = 1;
        this.timer_f = 0;
        this.timer_d = 0;
    }
    public  boolean DelayMs(long counterDelay, boolean run) {
        timer_d = counterDelay;
        //Сброс таймера
        if(run){
            timer_s = 0;
            timer_f = 0;
        }
        //Установка таймера
        if (timer_s == 0) {
            timer_s = System.currentTimeMillis();
            timer_f = timer_s + timer_d;
            status = true;
        }
        //Ожедание завершения
        if (timer_f <= System.currentTimeMillis()) {
            status = false;
        }
        return status;
    }

    public long DelayMs(){
        DelayMs(timer_d,false);//обновить значение
        if(timer_f >= System.currentTimeMillis())
            return (timer_f - System.currentTimeMillis())/1000;
        else
            return 0 ;
    }
}