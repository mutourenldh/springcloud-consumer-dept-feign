package com.haoge.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/** 
* @author 李东浩
* @Date：2018年4月29日下午3:33:06
*
*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.haoge.cloud"})
@ComponentScan("com.haoge.cloud")
public class DeptConsumerFeign_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerFeign_App.class, args);
	}

}
