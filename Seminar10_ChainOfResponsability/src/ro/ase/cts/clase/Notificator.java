package ro.ase.cts.clase;

public abstract class Notificator {
	private Notificator notificator;
	
	public abstract void trimiteNotificare(Client client, String text);

	public Notificator getNotificator() {
		return notificator;
	}

	public void setNotificator(Notificator notificator) {
		this.notificator = notificator;
	}
	
	
}
