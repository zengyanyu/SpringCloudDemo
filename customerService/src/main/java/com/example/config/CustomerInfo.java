package com.example.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.info.JavaInfo;
import org.springframework.boot.info.OsInfo;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerInfo implements InfoContributor {

    private SimpleDateFormat SIMPLE_DATE_FORMAT;

    private JavaInfo javaInfo;
    private OsInfo osInfo;

    public CustomerInfo() {
        this.javaInfo = new JavaInfo();
        this.osInfo = new OsInfo();
        SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Object> map = new HashMap<>();
        map.put("贡献者", "衍育");
        map.put("服务名称", "customer-service");
        map.put("描述", "Service Consumer");
        map.put("当前日期", SIMPLE_DATE_FORMAT.format(new Date()));
        map.put("java信息", this.javaInfo);
        map.put("操作系统", this.osInfo);
        builder.withDetails(map);
    }

}
