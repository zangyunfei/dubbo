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
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "say helloWorld!");
	}

}
