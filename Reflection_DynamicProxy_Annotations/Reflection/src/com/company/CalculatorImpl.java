package com.company;

import com.sun.org.glassfish.external.statistics.annotations.Reset;
import jdk.nashorn.internal.objects.annotations.Function;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//
//@Target(value= ElementType.FIELD)
//@Retention(value= RetentionPolicy.RUNTIME)
//@interface StopObject {
//
//}
//
////@ControlledObject(name="biscuits")
//class Cookies {
//
//
//    @StopObject
//    public void stopCookie(){
//        //бизнес логика
//    }
//}






public class CalculatorImpl implements Calculator{
    private int result = 1;
    private int variable = 0;
    String name ;
    public static final String MONDAY = "MMM";
    public static final String CONST_VAR = "bla bla";

    private int XXX(){
        return 1;
    }
    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int calc(int number){
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
