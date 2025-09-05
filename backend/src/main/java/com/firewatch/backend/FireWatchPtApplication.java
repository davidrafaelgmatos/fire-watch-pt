package com.firewatch.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.client.HttpClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication
@EnableScheduling
@SpringBootApplication(exclude = {
		HttpClientAutoConfiguration.class,
		RestClientAutoConfiguration.class
})
public class FireWatchPtApplication {

	public static void main(String[] args) {
		SpringApplication.run(FireWatchPtApplication.class, args);
	}

}
