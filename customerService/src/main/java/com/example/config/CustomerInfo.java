package com.example.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerInfo implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Object> map = new HashMap<>();
        map.put("贡献者", "衍育");
        map.put("artifactId", "customer-service");
        map.put("服务名称", "customer-service");
        map.put("描述", "Service Consumer");
        map.put("当前日期", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        builder.withDetails(map);
    }

}
