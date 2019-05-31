package com.ade.dialogflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ade.dialogflow"})
@PropertySources({
	@PropertySource("classpath:application.properties")
})
public class WlDialogflowInApplication {

	public static void main(String[] args) {
		SpringApplication.run(WlDialogflowInApplication.class, args);
	}

}
