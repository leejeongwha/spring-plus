package testAsync;

import static org.junit.Assert.*;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/testAsync/applicationContext.xml")
public class AsyncServiceTest {

	@Autowired
	private AsyncService asyncService;

	@Test
	public void test() throws InterruptedException {
		final SynchronousQueue<Object> queue = new SynchronousQueue<Object>();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
						asyncService.print(i);
					}

					Thread.sleep(Long.MAX_VALUE);
					queue.put(new Object());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		queue.poll(Long.MAX_VALUE, TimeUnit.SECONDS);
	}
}
