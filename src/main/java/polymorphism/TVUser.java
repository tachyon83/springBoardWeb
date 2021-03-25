package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
//		BeanFactory factory=new BeanFactory();
//		System.out.println(factory);
//		TV tv=(TV)factory.getBean(args[0]);
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
//		TV samsungTv=(TV)factory.getBean("SamsungTv");
//		TV lgTv=(TV)factory.getBean("LgTv");
//		
//		TV tv1=(TV)factory.getBean("SamsungTv");
//		TV tv2=(TV)factory.getBean("SamsungTv");
//		TV tv3=(TV)factory.getBean("SamsungTv");
		
		TV samsungTv=(TV)factory.getBean("samsungTV");
				
		samsungTv.powerOn();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		samsungTv.powerOff();
//		
//		lgTv.powerOn();
//		lgTv.volumeUp();
//		lgTv.volumeDown();
//		lgTv.powerOff();
		
		factory.close();
	}
}
