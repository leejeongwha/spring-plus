package selfanswer.conf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/selfanswer/conf/applicationContext.xml")
public class ConfCase {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ReuseService reuseService;
	
	@Test
	public void reuse() {
		logger.info(reuseService.getName());
	}
}
