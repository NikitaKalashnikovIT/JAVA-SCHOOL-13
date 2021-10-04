package ru.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String [] args){
        //для того чтобы спринг видел выбранные файлы в данном случае applicationContext.xml
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//объект какого класаа хочу получить в д.с. TestBean.class
        TestBean testBean  = context.getBean("testBean1",TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
