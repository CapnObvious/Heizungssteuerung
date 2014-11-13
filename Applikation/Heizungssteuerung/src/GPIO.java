
public class GPIO {
	
		public GPIO(){}
		
		
		public double getTemperatur(int Adresse){
			//Misst Temperatur
			return temperatur;
		}
		
		public void impuls(int Adresse){
			//Gibt Impuls z.B. für Mischer
		}
		
		public void ausgangSchalten(int Adresse){
			//Schaltet Ausgang z.B. für Pumpe
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