package constant;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/constant/constantContext.xml")
public class ConstantCase {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name = "usingConstant1")
	private UsingConstant usingConstant1;
	
	@Resource(name = "usingConstant2")
	private UsingConstant usingConstant2;
	
	@Test
	public void constantTest1() {
		logger.info(usingConstant1.getConstant());
	}
	
	@Test
	public void constantTest2() {
		logger.info(usingConstant2.getConstant());
	}
	
	@Resource(name = "usingConstant3")
	private UsingConstant usingConstant3;
	
	@Test
	public void constantTest3() {
		logger.info(usingConstant3.getConstant());
	}
}

