package com.example.onlineenergyutilityplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OnlineEnergyUtilityPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEnergyUtilityPlatformApplication.class, args);
	}

}
