package com.nhncorp.edu.plus.remoting.model;

import java.io.Serializable;

public class TransportModel implements Serializable {
	private static final long serialVersionUID = 5182273432655247791L;
	
	private String requestName;
	private String responseName;

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getResponseName() {
		return responseName;
	}

	public void setResponseName(String responseName) {
		this.responseName = responseName;
	}
}
