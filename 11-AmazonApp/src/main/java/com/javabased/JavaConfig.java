package com.javabased;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public ProductBean getProd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your ID :");
		int pId=sc.nextInt();
		String pName=sc.next();
		int quantity=sc.nextInt();
		double price = sc.nextDouble();
		
		ProductBean pb = new ProductBean(pId,pName,quantity,price);
		return pb;
	}
}
