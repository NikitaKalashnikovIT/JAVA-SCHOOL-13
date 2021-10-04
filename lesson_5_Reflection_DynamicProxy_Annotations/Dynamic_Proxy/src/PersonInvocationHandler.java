import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//InvocationHandler — это специальный интерфейс, который позволяет перехватить любые вызовы методов к нашему
// объекту и добавить нужное нам дополнительное поведение.
public class PersonInvocationHandler implements InvocationHandler {

    private CalculatorImpl calculatorImpl;

    public PersonInvocationHandler(CalculatorImpl calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    @Override
    //public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {

        Calculator calculator =new Calculator();
        Class clazz = calculator.getClass();

        if(clazz.isAnnotationPresent(Metric.class)) {
            //System.out.println("Аннотация @Metric к классу Calculator пременяется.");
            long start = System.nanoTime();
            method.invoke(calculatorImpl, args);
            long stop = System.nanoTime();
            System.out.println("Время выполнения метода: " + (stop - start));
            return null;
        }
        else {
            return method.invoke(calculatorImpl, args);
        }

    }
}