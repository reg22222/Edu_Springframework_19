package jeonggeun.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
		// 1. pring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup) 한다.
		TV tv = (TV) factory.getBean("tv"); // == TV tv = factory.getBean("tv",TV.class);
		TV tv2 = (TV) factory.getBean("tv"); 
		//TV tv3 = (TV) factory.getBean("tv"); //singleton 일때는 한번만 만들고, prototype이라면 3번만든다
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		factory.close();
	}

}
