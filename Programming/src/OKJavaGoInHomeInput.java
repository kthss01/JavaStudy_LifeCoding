import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {

	// parameter, 매개변수
	public static void main(String[] args) {
		
//		String id = "JAVA APT 507";

		// swing 이용
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String bright = JOptionPane.showInputDialog("Enter a Bright Level");

		String id = args[0];
		String bright = args[1];
		
		// Elevator Call
//			org.opentutorials.iot.Elevator
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); // 1층으로 엘리베이터 보내라는 명령
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " / Mood Lamp"); // 밝기 조절 되는 등
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
