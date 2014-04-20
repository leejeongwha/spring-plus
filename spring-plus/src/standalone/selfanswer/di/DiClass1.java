package selfanswer.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiClass1 {
	@Value("#{di['diclass.param1']}")
	private String param1;
	
	@Value("#{di['diclass.param2']}")
	private String param2;
	
	@Autowired
	private List<DiElem> elemList;
	
	@Autowired
	private Map<String, DiElem> elemMap;

	@Autowired
	private Set<DiElem> elemSet;
	
	@Autowired
	@Qualifier
	private List<DiElem> qualifierList;
	
	@Autowired
	@Qualifier
	private List<Object> qualifierAnyList;
	
	@Resource
	@TypeA
	private List<DiElem> iWantDiMapElem1List;
	
	@Resource
	@TypeB
	private List<DiElem> iWantDiMapElem2n3List;
	
	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public List<DiElem> getElemList() {
		return elemList;
	}

	public void setElemList(List<DiElem> elemList) {
		this.elemList = elemList;
	}

	public Map<String, DiElem> getElemMap() {
		return elemMap;
	}

	public void setElemMap(Map<String, DiElem> elemMap) {
		this.elemMap = elemMap;
	}

	public Set<DiElem> getElemSet() {
		return elemSet;
	}

	public void setElemSet(Set<DiElem> elemSet) {
		this.elemSet = elemSet;
	}
	
	
}
