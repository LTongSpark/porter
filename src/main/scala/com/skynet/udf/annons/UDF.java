package com.skynet.udf.annons;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface UDF {
    String value() ;
}
