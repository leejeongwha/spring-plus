package selfanswer.di_lecture;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiClass {
	private String param1;
	
	private String param2;
	
	private List<DiElem> elemList;
	
	private Map<String, DiElem> elemMap;

	private Set<DiElem> elemSet;

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
