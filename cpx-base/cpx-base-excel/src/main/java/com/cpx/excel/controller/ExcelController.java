package com.cpx.excel.controller;

import com.cpx.excel.config.ExcelUtils;
import com.cpx.excel.domain.UserExport;
import com.cpx.excel.domain.UserImport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：pengxiang chen
 * @date ：Created in 2023-05-29
 * @description ：
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/excel")
public class ExcelController {


    /**
     * 导出excel
     */
    @GetMapping("/export")
    public void export(HttpServletResponse response) {
        ArrayList<UserExport> users = new ArrayList<>();
        users.add(new UserExport("小明","1",new Date(), BigDecimal.valueOf(15.555)));
        ExcelUtils.resultExport(response, "用户信息", "用户信息",users ,UserExport.class );
    }


    /**
     * 导入数据
     */
    @PostMapping("/import")
    public List<UserImport> importExcel(MultipartFile uploadFile) {
        List<UserImport> rewardPunishDataImportList = ExcelUtils.readExcel("", UserImport.class, uploadFile);
        log.info("导入数据:{}", rewardPunishDataImportList);
        return rewardPunishDataImportList;
    }


}
