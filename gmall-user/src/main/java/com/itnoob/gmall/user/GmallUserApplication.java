package com.itnoob.gmall.user;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.itnoob.gmall.user.mapper") 不使用通用mapper的注解,包不同
@MapperScan(basePackages = "com.itnoob.gmall.user.mapper") // 通用mapper包含增删改查内置方法不需要写mapper的xml文件
public class GmallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserApplication.class, args);
	}

}





































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































