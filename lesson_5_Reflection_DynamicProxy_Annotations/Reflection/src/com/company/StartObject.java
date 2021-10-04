package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//public @interface StartObject {
//}


import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;

@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface StartObject {
}

//@Target(value=ElementType.METHOD)
//@Retention(value= RetentionPolicy.RUNTIME)
//public @interface StopObject {
//}
//
//@Target(value=ElementType.TYPE)
//@Retention(value= RetentionPolicy.RUNTIME)
//public @interface ControlledObject {
//    String name();
//}