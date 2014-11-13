import 


public class Fußbodenheizung {
	private Pumpe pumpe;
	private Fühler vorlauf;
	private Mischer mischer;
	private boolean zustand;
	private double sollTemperatur;
	
	public Fußbodenheizung(Pumpe Pumpe, Fühler Vorlauf, Mischer Mischer){
		this.pumpe=Pumpe;
		this.vorlauf=Vorlauf;
		this.mischer=Mischer;
	}
	
	public void ein(double Temperatur){
		this.sollTemperatur=Temperatur;
		this.zustand=true;
	}
	
	public void aus(){
		this.zustand=false;
	}
	
	private void run(){
		while(1){
			if(zustand){
			if(vorlauf=>sollTemperatur){
				mischer.zu();
			}
			else{
				mischer.auf();
			}
		
		}
		}else{
			break;
		}
		
	}

}
