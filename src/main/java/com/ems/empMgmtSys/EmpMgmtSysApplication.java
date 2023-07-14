package com.ems.empMgmtSys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmpMgmtSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMgmtSysApplication.class, args);
	}

}
