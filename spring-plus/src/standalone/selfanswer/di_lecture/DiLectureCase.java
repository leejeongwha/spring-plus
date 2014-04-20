package selfanswer.di_lecture;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/selfanswer/di_lecture/diContext.xml")
public class DiLectureCase {
	@Resource(name = "diClass")
	private DiClass diClass;
	
	@Test
	public void showDiClass1() {
		System.out.println();
	}
}
