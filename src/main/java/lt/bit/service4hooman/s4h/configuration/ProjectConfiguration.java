package lt.bit.service4hooman.s4h.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
<<<<<<< HEAD
import com.fasterxml.jackson.databind.ObjectMapper;

=======
>>>>>>> master
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
@Configuration
public class ProjectConfiguration {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
