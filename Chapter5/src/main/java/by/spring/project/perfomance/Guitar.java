package by.spring.project.perfomance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@StringedInstrument
public class Guitar implements Instrument{
	
	@Value("Hello")
	private String song;

	public String play() {
		return song;
	}

}
