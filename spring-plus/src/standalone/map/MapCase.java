package map;

import java.util.Iterator;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/map/mapContext.xml")
public class MapCase {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "mapModel1")
	private MapModel mapModel1;

	@Resource(name = "mapModel2")
	private MapModel mapModel2;

	@Resource(name = "mapModel3")
	private MapModel mapModel3;

	@Test
	public void listTest1() {
		Iterator<String> keys = mapModel1.getNameMap().keySet().iterator();

		while (keys.hasNext()) {
			String key = keys.next();
			logger.info(key + " : " + mapModel1.getNameMap().get(key));
		}
	}

	@Test
	public void listTest2() {
		Iterator<String> keys = mapModel2.getNameMap().keySet().iterator();

		while (keys.hasNext()) {
			String key = keys.next();
			logger.info(key + " : " + mapModel2.getNameMap().get(key));
		}
	}

	@Test
	public void listTest3() {
		Iterator<String> keys = mapModel3.getNameMap().keySet().iterator();

		while (keys.hasNext()) {
			String key = keys.next();
			logger.info(key + " : " + mapModel3.getNameMap().get(key));
		}
	}
}
