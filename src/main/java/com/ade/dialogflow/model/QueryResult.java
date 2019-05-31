package com.ade.dialogflow.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class QueryResult {

	@JsonProperty("queryText")
	private String queryText;
	
	@JsonProperty("queryText")
	public String getQueryText() {
		return queryText;
	}

	@JsonProperty("queryText")
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
	
	@JsonProperty("parameters")
	private Parameters parameters;
	
	@JsonProperty("parameters")
	public Parameters getParameters() {
		return parameters;
	}

	@JsonProperty("parameters")
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}

	@JsonProperty("allRequiredParamsPresent")
	private Boolean allRequiredParamsPresent;
	
	@JsonProperty("allRequiredParamsPresent")
	public Boolean getAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}

	@JsonProperty("allRequiredParamsPresent")
	public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}
	
	@JsonProperty("fulfillmentMessages")
	private List<Object> fulfillmentMessages = new ArrayList<>();
	
	@JsonProperty("fulfillmentMessages")
	public List<Object> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	@JsonProperty("fulfillmentMessages")
	public void setFulfillmentMessages(List<Object> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	@JsonProperty("intent")
	private Intent intent;
	
	@JsonProperty("intent")
	public Intent getIntent() {
		return intent;
	}

	@JsonProperty("intent")
	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	@JsonProperty("intentDetectionConfidence")
	private String intentDetectionConfidence;
	
	@JsonProperty("intentDetectionConfidence")
	public String getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	@JsonProperty("intentDetectionConfidence")
	public void setIntentDetectionConfidence(String intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}
	
	@JsonProperty("languageCode")
	private String languageCode;

	@JsonProperty("languageCode")
	public String getLanguageCode() {
		return languageCode;
	}

	@JsonProperty("languageCode")
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	
	
	
}
