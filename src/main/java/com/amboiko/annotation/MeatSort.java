package com.amboiko.annotation;

import com.amboiko.common.MeatType;

import java.lang.annotation.*;

@Inherited // This needs for extended class for getAnnotations()
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MeatSort {
    MeatType sort() default MeatType.REGULAR;
}
