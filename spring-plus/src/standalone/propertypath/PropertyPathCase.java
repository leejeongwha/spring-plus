package propertypath;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/propertypath/propertyPathContext.xml")
public class PropertyPathCase {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "parentBean1")
	private ParentBean parentBean1;
	
	@Resource(name = "parentBean2")
	private ParentBean parentBean2;
	
	@Resource(name = "childName")
	private String childName;

	@Test
	public void propertyPathTest1() {
		logger.info(parentBean1.getChildBean().getName());
	}
	
	@Test
	public void propertyPathTest2() {
		logger.info(parentBean2.getChildBean().getName());
	}
	
	@Test
	public void propertyPathTest4() {
		logger.info(childName);
	}
	
	@Resource(name = "parentBean3")
	private ParentBean parentBean3;
	
	@Test
	public void propertyPathTest3() {
		logger.info(parentBean3.getChildBean().getName());
	}
}

