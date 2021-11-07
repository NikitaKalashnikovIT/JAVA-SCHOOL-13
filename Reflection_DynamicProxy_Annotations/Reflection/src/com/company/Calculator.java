package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface Calculator{
    /**
     * Расчет факториала числа.
     * @param number
     */
    int calc (int number);
}

