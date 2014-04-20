package set;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/set/setContext.xml")
public class SetCase {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name = "setModel1")
	private SetModel setModel1;
	
	@Resource(name = "setModel2")
	private SetModel setModel2;
	
	@Resource(name = "setModel3")
	private SetModel setModel3;
	
	@Test
	public void listTest1() {
		for (String name : setModel1.getNameSet()) {
			logger.info(name);
		}
	}
	
	@Test
	public void listTest2() {
		for (String name : setModel2.getNameSet()) {
			logger.info(name);
		}
		
		Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
	}
	
	@Test
	public void listTest3() {
		for (String name : setModel3.getNameSet()) {
			logger.info(name);
		}
	}
}
