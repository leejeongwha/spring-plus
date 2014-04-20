package testDataHandler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/testDataHandler/applicationContext.xml")
public class DataHandlerTest {
	
	@Autowired
	private DataHandler dataHandler;

	@Test
	public void test() {
		System.out.println(dataHandler.get("nhncorp"));
		System.out.println(dataHandler.get("daum"));
	}

}
