package com.ade.dialogflow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class ResponseDialogflow {

	@JsonProperty("responseId")
	private String responseId;
	
	@JsonProperty("responseId")
	public String getResponseId() {
		return responseId;
	}

	@JsonProperty("responseId")
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	
	@JsonProperty("queryResult")
	private QueryResult queryResult;
	
	@JsonProperty("queryResult")
	public QueryResult getQueryResult() {
		return queryResult;
	}

	@JsonProperty("queryResult")
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	
	@JsonProperty("originalDetectIntentRequest")
	private Object originalDetectIntentRequest;

	@JsonProperty("originalDetectIntentRequest")
	public Object getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	@JsonProperty("originalDetectIntentRequest")
	public void setOriginalDetectIntentRequest(Object originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

	@JsonProperty("session")
	private String session;
	
	@JsonProperty("session")
	public String getSession() {
		return session;
	}

	@JsonProperty("session")
	public void setSession(String session) {
		this.session = session;
	}

	
	
	

	
	
	
	
	
}
