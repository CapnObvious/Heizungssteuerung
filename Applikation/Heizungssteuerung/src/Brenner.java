
public class Brenner {
	private boolean zustand;
	private int adresse;
	private GPIO gpio;
	
	public Brenner(int Adresse, GPIO Gpio){
		this.adresse=Adresse;
		zustand=false;
		this.gpio=Gpio;
	}
	
	public void ein(){
		zustand=true;
		//GPIO
	}
	
	public void aus(){
		zustand=false;
		//GPIO
	}
	
	public boolean getZustand(){
		return zustand;
	}
}
