package com.nhncorp.edu.plus.remoting.service;

import com.nhncorp.edu.plus.remoting.model.TransportModel;

public class HessianTestService implements RemotingTestService {
	public TransportModel getModel(TransportModel model) {
		model.setResponseName("Hessian");
		return model;
	}
}

