package infrastructure.send;

import domain.ports.Send;

public class SendEmail implements Send{
	//clase que implementa el tipo de envió por correo o SMS
	public void sendMessage(String message) {
		System.out.println("Se envía factura por correo " + message);
	}
}