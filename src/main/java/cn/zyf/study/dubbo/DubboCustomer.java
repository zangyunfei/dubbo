package cn.zyf.study.dubbo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zyf.study.dubbo.customer.HelloWorld;

public class DubboCustomer {

	private static final Log log = LogFactory.getLog(DubboCustomer.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/dubbo-customer.xml");
		HelloWorld h = (HelloWorld) context.getBean("helloWorld");
		h.say("zyf");
	}
}