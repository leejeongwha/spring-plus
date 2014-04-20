package remoting;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhncorp.edu.plus.remoting.model.TransportModel;
import com.nhncorp.edu.plus.remoting.service.RemotingTestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/remoting/remotingContext.xml")
public class RemotingCase {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/*@Resource(name = "rmiClient")
	private RemotingTestService rmiClient;
	
	@Test
	public void rmiTest() {
		TransportModel model = new TransportModel();
		model.setRequestName("rmi");
		
		model = rmiClient.getModel(model);
		
		logger.info(model.getRequestName() + " : " + model.getResponseName());
	}*/
	
	@Resource(name = "hessianClient")
	private RemotingTestService hessianClient;
	
	@Test
	public void hessianTest() {
		TransportModel model = new TransportModel();
		model.setRequestName("hessian");
		
		model = hessianClient.getModel(model);
		
		logger.info(model.getRequestName() + " : " + model.getResponseName());
	}
	
	@Resource(name = "burlapClient")
	private RemotingTestService burlapClient;
	
	@Test
	public void burlapTest() {
		TransportModel model = new TransportModel();
		model.setRequestName("burlap");
		
		model = burlapClient.getModel(model);
		
		logger.info(model.getRequestName() + " : " + model.getResponseName());
	}
	
	@Resource(name = "httpInvokerClient")
	private RemotingTestService httpInvokerClient;
	
	@Test
	public void httpInvokerTest() {
		TransportModel model = new TransportModel();
		model.setRequestName("httpInvoker");
		
		model = httpInvokerClient.getModel(model);
		
		logger.info(model.getRequestName() + " : " + model.getResponseName());
	}
}
