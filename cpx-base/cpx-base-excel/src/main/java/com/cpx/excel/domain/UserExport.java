package com.cpx.excel.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@AllArgsConstructor
@ContentRowHeight(30) //设置内容高度
@HeadRowHeight(40)    //设置标题高度
@ColumnWidth(25)      //设置列宽
public class UserExport implements Serializable {
    public static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @ExcelProperty(value = {"用户主题1","用户名"}, index = 0)
    private String userName;

    /**
     * 工号
     */
    @ExcelProperty(value = {"工号"}, index = 1)
    private String userCode;


    /**
     * 生日
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty(value = "生日", index = 2)
    private Date birthday;

    /**
     * 工资
     */
    @NumberFormat("#.##")
    @ExcelProperty(value = "工资", index = 3)
    private BigDecimal salary;

}
