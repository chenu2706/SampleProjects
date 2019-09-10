package com.hungryTripperDemo.modal;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.ObjectError;

@Component
public class CustomerResponse {
	
	private String responseCode;
	private String responseField;
	private String responseDesc;
	private List<ObjectError> allError;
	
	public List<ObjectError> getAllError() {
		return allError;
	}
	public void setAllError(List<ObjectError> list) {
		this.allError = list;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseField() {
		return responseField;
	}
	public void setResponseField(String responseField) {
		this.responseField = responseField;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	

}
