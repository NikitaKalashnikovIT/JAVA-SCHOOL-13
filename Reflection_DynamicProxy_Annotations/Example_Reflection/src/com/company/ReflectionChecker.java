package com.company;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
//import java.lang.reflect.Field;

public class ReflectionChecker {

    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());

    }
    public void  ShowClassFilde(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public void ShowClassMethods(Object object){
        Class clazz = object.getClass();
        Method [] methods = clazz.getMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }

    }
//    public void showFiledsAnnotations(Object object){
//        Class clazz = object.getClass();
//        Method [] methods = clazz.getAnnotations();
//        for(Method method : methods) {
//            System.out.println(method.getName());
//        }
//    }
}
