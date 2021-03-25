package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
//	@Autowired
//	@Qualifier("SonySpeaker")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("lg tv object created.");
	}
	public void powerOn() {
		System.out.println("lg tv power on");
	}
	public void powerOff() {
		System.out.println("lg tv power off");
	}
	public void volumeUp() {
		this.speaker.volumeUp();
//		System.out.println("lg tv volume up");
	}
	public void volumeDown() {
		this.speaker.volumeDown();
//		System.out.println("lg tv volume down");
	}
}
