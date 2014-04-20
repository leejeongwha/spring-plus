package selfanswer.di;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/selfanswer/di/diContext.xml")
public class DiCase {
	@Resource(name = "diClass")
	private DiClass diClass;
	
	@Autowired
	private DiClass1 diClass1;
	
	@Test
	public void showDiClass1() {
		assertThat(diClass.getParam1(), is(diClass1.getParam1()));
		assertThat(diClass.getParam2(), is(diClass1.getParam2()));
	}
	
	@Test 
	public void showDiClass2() {
		List<DiElem> elemList = diClass.getElemList();
		List<DiElem> elemList1 = diClass1.getElemList();
		
		for (int i = 0; i < elemList.size(); i++) {
			DiElem elem1 = elemList.get(i);
			DiElem elem2 = elemList1.get(i);
			
			assertThat(elem1.getElemParam1(), is(elem2.getElemParam1()));
			assertThat(elem1.getElemParam2(), is(elem2.getElemParam2()));
		}
	}
	
	@Test 
	public void showDiClass3() {
		Map<String, DiElem> elemMap = diClass.getElemMap();
		Map<String, DiElem> elemMap1 = diClass1.getElemMap();
		
		Iterator<String> keys = elemMap.keySet().iterator();
		Iterator<String> keys1 = elemMap1.keySet().iterator();
		
		while (keys.hasNext()) {
			String key = keys.next();
			String key1 = keys1.next();
			
			assertThat(key, is(key1));
		}
		
		Iterator<DiElem> elems = elemMap.values().iterator();
		Iterator<DiElem> elems1 = elemMap1.values().iterator();
		
		while (elems.hasNext()) {
			DiElem elem1 = elems.next();
			DiElem elem2 = elems1.next();
			
			assertThat(elem1.getElemParam1(), is(elem2.getElemParam1()));
			assertThat(elem1.getElemParam2(), is(elem2.getElemParam2()));
		}
	}
	
	@Test 
	public void showDiClass4() {
		Set<DiElem> elemSet = diClass.getElemSet();
		Set<DiElem> elemSet1 = diClass1.getElemSet();
		
		Iterator<DiElem> elems = elemSet.iterator();
		Iterator<DiElem> elems1 = elemSet1.iterator();
		
		while (elems.hasNext()) {
			DiElem elem1 = elems.next();
			DiElem elem2 = elems1.next();
			
			assertThat(elem1.getElemParam1(), is(elem2.getElemParam1()));
			assertThat(elem1.getElemParam2(), is(elem2.getElemParam2()));
		}
	}
}
