package com.qianmi.uc;

import com.qianmi.uc.config.TestProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(value = {"${application.scan-package}"})
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);

		System.out.println(context.getBean(TestProperties.class).getPwd());

		System.out.println("1232323");
	}
}
