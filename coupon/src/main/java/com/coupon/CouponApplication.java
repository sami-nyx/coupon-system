package com.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coupon.model.Company;

@SpringBootApplication
public class CouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponApplication.class, args);
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	Company company=(Company)ctx.getBean("company");
	System.out.println(company);
	
	}

}
