package com.company;
import com.company.Rebbit.Rabbit;
import java.io.*;
import java.util.Arrays;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import java.lang.annotation.*;

class ThrowDemo {

    public static void main(String args[]){
    ReflectionChecker Checker = new ReflectionChecker();
    Rabbit rabbit = new Rabbit();

//    Checker.showClassName(rabbit);
//    Checker.ShowClassFilde(rabbit);
//    Checker.ShowClassMethods(Checker);
       // public void onMessageReceived(MessageReceivedEvent event)
        //{
        String S1 = new String("UPPERCASE CONVERTED TO LOWERCASE");
        //Convert to LowerCase
        System.out.println(S1.toLowerCase());


//        String event = "Бот";
//            String message = event.toLowerCase();
//            System.out.println(message);
//
//        if (message.startsWith("бот"))
//        {
//
//        }
//
//        String Str = new String("Добро пожаловать на ProgLang.su");
//
//        System.out.print("Возвращаемое значение: " );
//        System.out.println(Str.startsWith("Добро пожаловать") );
//
//        System.out.print("Возвращаемое значение: " );
//        System.out.println(Str.startsWith("ProgLang") );
//
//        System.out.print("Возвращаемое значение: " );
//        System.out.println(Str.startsWith("пожаловать",6
//        ) );
        //}
        /////////////////////////////////////////////////////////////////////////////
//            String event = "Бот hjhjhj";
//            String message = event.toLowerCase();
//            System.out.println(message);
//
//
//        if (message.startsWith("бот"))
//        {
//            try
//            {
//                //получим массив {"Бот", "(команду)", "аргумент1", "аргумент2",... "аргументN"};
//                String[] args1 = message.split(" ");
//                System.out.println("11111");
//                System.out.println(args1);
//                //Для удобства уберем "бот" и отделим команду от аргументов
//                //String command = args[0].toLowerCase();
//                System.out.println("22222");
//                //System.out.println(command);
//                String[] nArgs = Arrays.copyOfRange(args1, 2, args1.length);
//                System.out.println("33333");
//                System.out.println(nArgs);
//                //Получили command = "(команда)"; nArgs = {"аргумент1", "аргумент2",..."аргументN"};
//                //Данный массив может быть пустым
//            }
//            catch (ArrayIndexOutOfBoundsException e)
//            {
//                System.out.println("00000");
//                //Вывод списка команд или какого-либо сообщения
//                //В случае если просто написать "Бот"
//            }
//        }
        /////////////////////////////////////////////////////////////////////////

    }
}

//Указывает, что наша Аннотация может быть использована
//Во время выполнения через Reflection (нам как раз это нужно).
@Retention(RetentionPolicy.RUNTIME)

//Указывает, что целью нашей Аннотации является метод
//Не класс, не переменная, не поле, а именно метод.
@Target(ElementType.METHOD)
@interface Command //Описание. Заметим, что перед interface стоит @;
{
    //Команда за которую будет отвечать функция (например "привет");
    String name();

    //Аргументы команды, использоваться будут для вывода списка команд
    String args();

    //Минимальное количество аргументов, сразу присвоили 0 (логично)
    int minArgs() default 0;

    //Описание, тоже для списка
    String desc();

    //Максимальное число аргументов. В целом не обязательно, но тоже можно использовать
    int maxArgs() default Integer.MAX_VALUE;

    //Показывать ли команду в списке (вовсе необязательная строка, но мало ли, пригодится!)
    boolean showInHelp() default true;

    //Какие команды будут считаться эквивалентными нашей
    //(Например для "привет", это может быть "Здаров", "Прив" и т.д.)
    //Под каждый случай заводить функцию - не рационально
    String[] aliases();

}
//////////////////////////////////////////////////////////////////////////


@Target(value=ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface Name {
    String name();
    String type() default  "string";
}