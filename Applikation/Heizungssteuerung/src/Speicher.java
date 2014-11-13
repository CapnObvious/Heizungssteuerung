
public class Speicher {
		private Fühler max, min;
		private Pumpe ladepumpe;
		
		public Speicher(Fühler Max, Fühler Min, Pumpe Ladepumpe){
			this.max=Max;
			this.min=Min;
			this.ladepumpe=Ladepumpe;
		}
		
		
		public void laden(){
			this.ladepumpe.ein();
		}
		
		public void aus(){
			this.ladepumpe.aus();
		}
		
		public double getMaxTemperatur(){
			return max.getTemperatur();
		}
		public double getMinTemperatur(){
			return min.getTemperatur();
		}
}
