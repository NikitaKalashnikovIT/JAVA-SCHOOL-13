import java.lang.reflect.Proxy;

public class PerformanceProxy {

    public PerformanceProxy(Object myObject) {

        //ClassLoader (загрузчик классов) оригинального объекта и список всех
        // интерфейсов,которые реализует наш оригинальный класс (то есть clazz).
        ClassLoader myObjectClassLoader = myObject.getClass().getClassLoader();

        //Все интерфейсы, которые реализует оригинальный объект
        Class[] interfaces = myObject.getClass().getInterfaces();

        //Создаем прокси нашего объекта myObject
        //В метод мы передаем ту информацию об оригинальном классе, которую получили на прошлом шаге
        // (его ClassLoader и список его интерфейсов), а также объект созданного нами ранее перехватчика —
        // InvocationHandler’a. Оригинальный объект myObject
        CalculatorImpl proxyVasia = (CalculatorImpl) Proxy.newProxyInstance(myObjectClassLoader, interfaces, new PersonInvocationHandler((CalculatorImpl) myObject));

        //Вызываем у прокси объекта один из методов нашего оригинального объекта
        proxyVasia.calc(5);

    }
}
