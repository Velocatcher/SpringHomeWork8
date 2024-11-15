package com.example.demo.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//Аннотация используется во время выполнения
@Target(ElementType.METHOD)//Применяется только к методам
public @interface LoggedExecution {
}
