
public class Heizkreis {
	private Pumpe pumpe;
	
	public Heizkreis(Pumpe Pumpe){
		this.pumpe=Pumpe;
	}
	
	public void ein(){
		pumpe.ein();
	}
	
	public void aus(){
		pumpe.aus();
	}

}
