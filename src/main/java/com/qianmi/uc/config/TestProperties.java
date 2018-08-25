package com.qianmi.uc.config;
/**
 * @author 叶延平[OF1643]
 * @Description:
 * @date 2018/8/17 14:40
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @create 2018-08-17 14:40
 **/
@ConfigurationProperties(prefix = "qianmi.test")
@Configuration
@Data
public class TestProperties {
    private String user;

    private String pwd;


    public TestProperties() {

        System.out.println("加载TestProperties");
    }
}
