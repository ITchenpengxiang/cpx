package com.cpx.excel.domain;

import com.cpx.excel.utils.ExcelColumn;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-29
 * @description ：
 * @version: 1.0
 */
@Data
public class UserImport implements Serializable {

    public static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @ExcelColumn(value = "用户名", col = 1)
    private String userName;

    /**
     * 工号
     */
    @ExcelColumn(value = "工号", col = 2)
    private String userCode;

    /**
     * 生日
     */
     @ExcelColumn(value = "生日", col = 3)
    private Date birthday;

    /**
     * 工资
     */
    @ExcelColumn(value = "工资", col = 4)
    private BigDecimal salary;
}
