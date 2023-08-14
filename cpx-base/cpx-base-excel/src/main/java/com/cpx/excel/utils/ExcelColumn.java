package com.cpx.excel.utils;

import java.lang.annotation.*;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-29
 * @description ：
 * @version: 1.0
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {

    /**
     * Excel标题
     */
    String value() default "";

    /**
     * Excel从左往右排列位置
     */
    int col() default 0;

}
