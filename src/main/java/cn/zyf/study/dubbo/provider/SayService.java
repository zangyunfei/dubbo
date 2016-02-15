package cn.zyf.study.dubbo.provider;

import org.springframework.stereotype.Service;

import cn.zyf.study.dubbo.interfaces.ISayService;

/**
 * 
 * @author admin
 *
 */
@Service("sayService")
public class SayService implements ISayService {

	/**
	 * some one talk
	 * 
	 * @param name
	 * @return
	 */
	public void say(String name) {
		System.out.println(name + "say helloWorld!");
	}

}
