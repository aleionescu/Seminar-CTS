package ro.ase.cts.clase;

public class NotificatorSMS extends Notificator {

	@Override
	public void trimiteNotificare(Client client, String text) {
		if(client.getNrTelefon()!= null) {
			System.out.println("Trimitere SMS catre: "+client.getNume()+" cu mesajul "+text);
		} else {
			if(super.getNotificator()!=null) {
				super.getNotificator().trimiteNotificare(client, text);
			}
			else {
				System.out.println("Domnule manager, nu avem date de contsact pentru clientul "+client.getNume());
			}
		}		
	}

}
