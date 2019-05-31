package com.ade.dialogflow.rest;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ade.dialogflow.model.ResponseDialogflow;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/com/wl-dialogflow-in")
public class WeatherWebhook {

	@RequestMapping(
	        value = "/weatherwebhook", 
	        method = RequestMethod.POST, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> processRequest(@RequestBody String rawJson) throws IOException {
		System.out.println("************************* REQUEST ***************************");
		System.out.println(rawJson);
		System.out.println("*********************************************************");
		ObjectMapper mapper = new ObjectMapper();
		ResponseDialogflow res = mapper.readValue(rawJson, ResponseDialogflow.class);
		String out = "result";
		System.out.println("Result "+out);
		return new ResponseEntity(null, HttpStatus.OK);
	}
}
