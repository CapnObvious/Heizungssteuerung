
public class Fühler {
	
	private int adresse;
	private GPIO gpio;

	public Fühler(int Adresse, GPIO Gpio){
		this.adresse=Adresse;
		this.gpio=Gpio;
	}
	
	public double getTemperatur(){
		return gpio.getTemperatur(this.adresse);
	}
}
