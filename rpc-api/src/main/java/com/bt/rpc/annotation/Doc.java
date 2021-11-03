/**
 * Botaoyx.com Inc.
 * Copyright (c) 2021-2021 All Rights Reserved.
 */
package com.bt.rpc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * RPC 字段、DTO的文档说明。
 * 说清楚字段含有，是否必须通过javax.validation-api自动识别。
 *
 * @author Martin.C
 * @version 2021/11/02 2:57 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface Doc {

    String value() ;

    String version() default "";

    String since() default "";
}