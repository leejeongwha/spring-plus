package com.nhncorp.edu.plus.remoting.service;

import com.nhncorp.edu.plus.remoting.model.TransportModel;

public class HttpInvokerTestService implements RemotingTestService {
	public TransportModel getModel(TransportModel model) {
		model.setResponseName("HttpInvoker");
		return model;
	}
}

