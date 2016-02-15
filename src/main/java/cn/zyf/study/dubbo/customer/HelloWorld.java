package cn.zyf.study.dubbo.customer;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.zyf.study.dubbo.interfaces.ISayService;

@Service
public class HelloWorld {

	@Resource(name = "ISayService")
	private ISayService sayService;

	/**
	 * some one talk
	 * 
	 * @param name
	 * @return
	 */
	public void say(String name) {
		sayService.say(name);
	}

}
