//https://restless-man.livejournal.com/24320.html
//https://javarush.ru/groups/posts/2281-dinamicheskie-proksi
//import java.lang.reflect.Proxy;
//Dynamic Proxy — это паттерн!
public class Main {

    public static void main(String[] args) {
        PerformanceProxy performanceProxy = new PerformanceProxy(new Calculator());
    }
}