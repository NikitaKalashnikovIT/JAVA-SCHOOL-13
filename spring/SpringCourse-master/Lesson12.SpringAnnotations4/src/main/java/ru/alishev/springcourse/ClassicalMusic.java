package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
@Component
@Scope("prototype")//указывает что при обявлении сылки на этот мето все хеши методов будут разные
//в противном случае все ссылки будут ссылатся на одни и теже методы и поля
public class ClassicalMusic implements Music {
//смотри в следуещем примере
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    //смотри в следуещем примере
    // Для Prototype бинов не вызывается destroy-метод!
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
