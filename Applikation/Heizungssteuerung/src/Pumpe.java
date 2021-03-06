
public class Pumpe {

	private int adresse;
	private GPIO gpio;
	private boolean zustand;
	
	public Pumpe(int Adresse, GPIO Gpio){
		this.adresse= Adresse;
		this.gpio=Gpio;
		this.zustand=false;
	}
	
	public void ein(){
		this.zustand=true;
		gpio.ausgangSchalten(adresse);
	}
	
	public void aus(){
		this.zustand=false;
		gpio.ausgangSchalten(adresse);
	}
}
