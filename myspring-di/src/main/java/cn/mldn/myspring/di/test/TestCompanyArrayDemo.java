package cn.mldn.myspring.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.di.vo.CompanyArray;

public class TestCompanyArrayDemo {
	public static void main(String[] args) {
		//启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/*.xml") ;
		System.out.println(context.getBean("companyArray",CompanyArray.class));
	}
}
