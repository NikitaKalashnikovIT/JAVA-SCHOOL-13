package com.company;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        CalculatorImpl calculatorImpl = new CalculatorImpl();
        ReflectionChecker Checker = new ReflectionChecker();

        //System.out.println(calculatorImpl.calc(5));

        System.out.println("Пакет и имя класса ReflectionChecker: ");
        Checker.showClassName(calculatorImpl);
        System.out.println("\n----------------------------------------\n");

        System.out.println("Поля класса ReflectionChecker: ");
        Checker.ShowClassFilde(calculatorImpl);
        System.out.println("\n----------------------------------------\n");

        System.out.println("Методы класса ReflectionChecker, включая приватные : ");
        Checker.ShowClassMethods(calculatorImpl);
        System.out.println("\n----------------------------------------\n");

        System.out.println("Геттеры и сеттеры,класса ReflectionChecker, включая приватные : ");
        Checker.ShowtGettersSetters(calculatorImpl);
        System.out.println("\n----------------------------------------\n");

        System.out.println("Константы и их значения,класса ReflectionChecker, включая приватные : ");
        Checker.ShowClassFildeConst(calculatorImpl,"MONDAY");
        Checker.ShowClassFildeConst(calculatorImpl,"CONST_VAR");
        System.out.println("\n----------------------------------------\n");





        //@Annotationss
//        void ggg(){
//
//        }


        // получить экземпляр класса, используя метод forName
        Cookies cookies =new Cookies();
            Class cl = null;
        Class clazz = cookies.getClass();
//            try {
//                cl = Class.forName("java.lang.String");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            System.out.print("Class represented by c1: "+ cl.toString());

//            Class cl = Class.forName("com.company.");
        if(!clazz.isAnnotationPresent(Metric.class))
            System.out.println("Аннотация к классу не пременяется @Metric");
        else
            System.out.println("Аннотация к классу применяется @Metric");

    }
}
