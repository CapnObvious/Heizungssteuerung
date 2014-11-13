
public class Mischer {
	
	public int adresse1, adresse2;
	public Mischer(int Adresse1, int Adresse2){
		this.adresse1=Adresse1;
		this.adresse2=Adresse2;
	}
	
	public void auf(){
		GPIO.impuls(this.adresse1);
	}
	
	public void zu(){
		GPIO.impuls(this.adresse2);
	}
}
