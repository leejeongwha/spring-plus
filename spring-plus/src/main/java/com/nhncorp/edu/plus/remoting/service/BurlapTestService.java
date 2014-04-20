package com.nhncorp.edu.plus.remoting.service;

import com.nhncorp.edu.plus.remoting.model.TransportModel;

public class BurlapTestService implements RemotingTestService {
	public TransportModel getModel(TransportModel model) {
		model.setResponseName("Bulrap");
		return model;
	}
}

