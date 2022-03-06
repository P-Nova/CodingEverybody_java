import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoHomeINPUT {

	// arguments 인자. 입력값
	// parameter 매개변수
	// 11-2강 파라미터를 통해서 인자를 전달하는 방식
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
	
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();

		DimmingLights moodLamp = new DimmingLights(id+" / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
// Elevator 라는 '데이터 타입'의 '변수' myElevator 
		
	}

}
