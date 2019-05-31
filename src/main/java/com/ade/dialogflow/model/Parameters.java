package com.ade.dialogflow.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Parameters {

	@JsonProperty("parameter_name")
	private String paramName;
	
	@JsonProperty("parameter_name")
	public String getParamName() {
		return paramName;
	}

	@JsonProperty("parameter_name")
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	@JsonProperty("parameter_value")
	private String paramValue;

	@JsonProperty("parameter_value")
	public String getParamValue() {
		return paramValue;
	}

	@JsonProperty("parameter_value")
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	
	
}
