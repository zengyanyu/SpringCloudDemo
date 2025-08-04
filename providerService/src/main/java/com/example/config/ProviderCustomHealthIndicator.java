package com.example.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

// 自定义健康指标，类名必须是XxxxxHealthIndicator
@Component
public class ProviderCustomHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("提供者自定义健康指示器", "provider service 服务启动正常！");
    }
}
