package property;

import java.util.Properties;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/property/propertyContext.xml")
public class PropertyCase {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name = "configurations1")
	private Properties configurations1;
	
	@Resource(name = "configurations1")
	private Properties configurations2;
	
	@Autowired
	private PropertyModel model;
	
	@Test
	public void propertyTest1() {
		logger.info(configurations1.getProperty("param1"));
		logger.info(configurations1.getProperty("param2"));
		logger.info(configurations2.getProperty("param3"));
	}
	
	@Test
	public void propertyTest2() {
		logger.info(configurations2.getProperty("param1"));
		logger.info(configurations2.getProperty("param2"));
		logger.info(configurations2.getProperty("param3"));
	}
	
	@Test
	public void propertyTest3() {
		logger.info(model.getParam1());
		logger.info(model.getParam2());
		logger.info(model.getParam3());
		logger.info(model.getParam4());
	}
}
