package by.spring.project.perfomance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist implements Perfomer{
	
	public Instrumentalist(){}
	
	@Autowired(required=false)
	@StringedInstrument
	private Instrument instrument;
	
	/*public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}*/

	public void perfome() {
		String sound = "No Instrument :(";
		
		if(instrument != null){
			sound = instrument.play();
		}
		
		System.out.println(sound);
	}

}
