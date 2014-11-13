


public class Steuerung {
	private Pumpe zirkulation, solarpumpe;
	private Ventil solarventil, pufferventil;
	protected GPIO gpio;
	private Speicher warmwasser;
	private Pufferspeicher puffer;
	private Brenner brenner;
	private Fühler kessel, solar;
	
	
	public Steuerung(){
		gpio=new GPIO();
		solarventil=new Ventil(015, 016, gpio);
		pufferventil=new Ventil(013, 014, gpio);
		zirkulation=new Pumpe(004, gpio);
		solarpumpe=new Pumpe(005, gpio);
		warmwasser=new Speicher(new Fühler(104, gpio), new Fühler(105, gpio), new Pumpe(003, gpio));
		puffer= new Pufferspeicher(new Fühler(106, gpio), new Fühler(107, gpio));
		brenner=new Brenner(201, gpio);
		kessel=new Fühler(101, gpio);
		solar=new Fühler(102, gpio);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private void warmwasserHeizenBrenner(double Temperatur){
		while(warmwasser.getMaxTemperatur()<=Temperatur){
			if(kessel.getTemperatur()>=(warmwasser.getMaxTemperatur()+5){
				warmwasser.laden();
			}
			else{ if(kessel.getTemperatur()<=warmwasser.getMaxTemperatur()+5){
				while(kessel.getTemperatur()<=70){
					brenner.ein();
				}
				brenner.aus();
			}
		}
	}
	
	
	
	
}


/*
Adressen:
00X: Pumpen:
001:HK1
002:HK2
003:BWL
004:BWZ
005:Solar


01X: Mischer, Ventile:
011: Mischer auf
012: Mischer zu
013: Ventil Puffer auf
014: Ventil Puffer zu
015: Ventil Solar auf
016: Ventil Solar zu


10X: Fühler:
101: Kessel
102: Solar
103: Vorl. HK2
104: BW oben
105: BW unten
106: Puffer oben
107: Puffer unten
108: Außen

20X:
201Brenner


*/