//https://restless-man.livejournal.com/24320.html
//https://javarush.ru/groups/posts/2281-dinamicheskie-proksi
//import java.lang.reflect.Proxy;
import java.lang.reflect.*;
//Dynamic Proxy — это паттерн!
public class Main {

    public static void main(String[] args) {
System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        //Создаем оригинальный объект
        Man vasia = new Man("Вася", 30, "Санкт-Петербург", "Россия");

        //Получаем загрузчик класса у оригинального объекта
        //Для создания прокси нам нужен ClassLoader (загрузчик классов) оригинального объекта и список всех
        // интерфейсов,которые реализует наш оригинальный класс (то есть Man).
        ClassLoader vasiaClassLoader = vasia.getClass().getClassLoader();

        //Получаем все интерфейсы, которые реализует оригинальный объект
        Class[] interfaces = vasia.getClass().getInterfaces();

        //Создаем прокси нашего объекта vasia
        //В метод мы передаем ту информацию об оригинальном классе, которую получили на прошлом шаге
        // (его ClassLoader и список его интерфейсов), а также объект созданного нами ранее перехватчика —
        // InvocationHandler’a. Главное — не забудь передать перехватчику наш оригинальный объект vasia, иначе
        // ему нечего будет «перехватывать» :)
        Person proxyVasia = (Person) Proxy.newProxyInstance(vasiaClassLoader, interfaces, new PersonInvocationHandler(vasia));

        /*

        Calculator  calculator=new PerformanceProxy(new Calculator()));
System.out.println(calculator.calc(3));

         */
        //Вызываем у прокси объекта один из методов нашего оригинального объекта
        //proxyVasia.introduce(vasia.getName());
        proxyVasia.introduce(vasia.toString());
        proxyVasia.sayAge(25);
        proxyVasia.sayFrom("hgh","uhuh");


    }
}