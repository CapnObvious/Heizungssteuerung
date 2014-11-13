
public class Pufferspeicher {
	private Fühler max, min;
	public Pufferspeicher(Fühler Max, Fühler Min){
		this.max=Max;
		this.min=Min;
	}
	

	public double getMaxTemperatur(){
		return max.getTemperatur();
	}
	public double getMinTemperatur(){
		return min.getTemperatur();
	}
}
