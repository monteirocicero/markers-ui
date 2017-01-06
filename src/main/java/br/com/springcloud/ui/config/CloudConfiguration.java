package br.com.springcloud.ui.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.springcloud.client.MarkersRepository;

@Configuration
@Profile({"cloud"})
public class CloudConfiguration extends AbstractCloudConfig {
	
	@Bean
	public MarkersRepository markersRepository() {
		return connectionFactory().service(MarkersRepository.class);
	}

}
