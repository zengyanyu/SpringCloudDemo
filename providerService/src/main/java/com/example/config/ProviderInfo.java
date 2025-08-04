package com.example.config;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.info.JavaInfo;
import org.springframework.boot.info.OsInfo;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class ProviderInfo implements InfoContributor {

    private JavaInfo javaInfo;
    private OsInfo osInfo;

    public ProviderInfo() {
        this.javaInfo = new JavaInfo();
        this.osInfo = new OsInfo();
    }

    @Override
    public void contribute(Builder builder) {
        Map<String, Object> map = new HashMap<>();
        map.put("贡献者", "衍育");
        map.put("服务名称", "provider-service");
        map.put("当前日期", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        map.put("java信息", this.javaInfo);
        map.put("操作系统", this.osInfo);
        builder.withDetails(map);
    }

}
