package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/3/28
 * @date 17/3/28
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value();
}
