package list;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/list/listContext.xml")
public class ListCase {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name = "listModel1")
	private ListModel listModel1;
	
	@Resource(name = "listModel2")
	private ListModel listModel2;
	
	@Resource(name = "listModel3")
	private ListModel listModel3;
	
	@Test
	public void listTest1() {
		for (String name : listModel1.getNameList()) {
			logger.info(name);
		}
	}
	
	@Test
	public void listTest2() {
		for (String name : listModel2.getNameList()) {
			logger.info(name);
		}
	}
	
	@Test
	public void listTest3() {
		for (String name : listModel3.getNameList()) {
			logger.info(name);
		}
	}
}
