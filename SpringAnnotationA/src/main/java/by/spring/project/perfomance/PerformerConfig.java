package by.spring.project.perfomance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PerformerConfig {
	
	@Bean
	public Perfomer duke(){
		return new Instrumentalist();
	}

}
