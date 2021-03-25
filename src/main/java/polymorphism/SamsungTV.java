package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {
	@Autowired
//	@Qualifier("sonySpeaker")
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("samsung tv object created.");
	}
	public SamsungTV(int a) {
		System.out.println("2nd constructor called with: "+a);
	}
	public void initMethod() {
		System.out.println("init Method called.");
		this.powerOn();
	}
	public void powerOn() {
		System.out.println("samsung tv power on");
	}
	public void powerOff() {
		System.out.println("samsung tv power off");
	}
	public void volumeUp() {
		this.speaker.volumeUp();
//		System.out.println("samsung tv volume up");
	}
	public void volumeDown() {
		this.speaker.volumeDown();
//		System.out.println("samsung tv volume down");
	}
}
