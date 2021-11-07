import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//InvocationHandler — это специальный интерфейс, который позволяет перехватить любые вызовы методов к нашему
// объекту и добавить нужное нам дополнительное поведение.
public class PersonInvocationHandler implements InvocationHandler {

    private Person person;

    public PersonInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Привет!");
        return method.invoke(person, args);
    }
}