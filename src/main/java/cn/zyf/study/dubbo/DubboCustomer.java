package cn.zyf.study.dubbo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zyf.study.dubbo.customer.HelloWorld;

public class DubboCustomer {

	private static final Log log = LogFactory.getLog(DubboCustomer.class);

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:spring/dubbo-customer.xml");
			HelloWorld h = (HelloWorld) context.getBean("helloWorld");
			h.say(i + "zyf");
			Thread.sleep(5 * 1000);
		}

	}
}