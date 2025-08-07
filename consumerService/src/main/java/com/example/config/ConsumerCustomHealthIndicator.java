package com.example.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

// 自定义健康指标，类名必须是XxxxxHealthIndicator
@Component
public class ConsumerCustomHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("消费者自定义健康指示器", "浙江宏振智能芯片有限公司成立于2019年11月，法定代表人为祝丽丹，注册资本1000万人民币，经营范围包括集成电路、电路模块、软...")
        .withDetail("key1","value1");
    }
}
