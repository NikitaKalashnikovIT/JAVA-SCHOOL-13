package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionChecker {

    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void  ShowClassFildeConst(Object object,String nameFilde){
        Class clazz = object.getClass();
        String name = null;

        try {
            Field fields = clazz.getDeclaredField(nameFilde);
            fields.setAccessible(true);
            name = (String) fields.get(clazz);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Не верно подобранно имя переменной или конмтанты");
        }
            System.out.println(nameFilde + " = " + name);
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
            clazz.getSuperclass();
        }
        methods = clazz.getDeclaredMethods();
        for(Method method2 : methods) {
            System.out.println(method2.getName());
            clazz.getSuperclass();
        }
    }

    public void ShowtGettersSetters(Object object){
        Class clazz = object.getClass();
        Method [] methods = clazz.getDeclaredMethods();

        for(Method method : methods){
            if(isGetter(method)) System.out.println("getter: " + method);
            if(isSetter(method)) System.out.println("setter: " + method);
        }
    }

    public static boolean isGetter(Method method){
        //проверяет, начинается ли строка с указанного префикса
        if(!method.getName().startsWith("get"))      return false;
        // Метод get не должен иметь параметров
        if(method.getParameterTypes().length != 0)   return false;
        if(void.class.equals(method.getReturnType())) return false;
        return true;
    }

    public static boolean isSetter(Method method) {
        if (!method.getName().startsWith("set")) return false;
        // set может повлиять на параметры. Параметр должен быть 1
        if (method.getParameterTypes().length != 1) return false;
        return true;
    }
}
