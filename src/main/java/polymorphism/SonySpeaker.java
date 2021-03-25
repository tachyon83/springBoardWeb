package polymorphism;

//import org.springframework.stereotype.Component;

//@Component
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("sonyspeaker object created.");
	}
	@Override
	public void volumeUp() {
		System.out.println("sony speaker volume up");
	}
	@Override
	public void volumeDown() {
		System.out.println("sony speaker volume down");
	}
}
