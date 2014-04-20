package property;

import org.springframework.beans.factory.annotation.Value;

public class PropertyModel {
	@Value("#{configurations2['param1']}")
	private String param1;
	
	@Value("#{configurations2['param2']}")
	private String param2;
	
	@Value("#{configurations2['param3']}")
	private String param3;
	
	@Value("#{configurations2['param4']?:'noValue'}")
	private String param4;

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

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getParam4() {
		return param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
	}
}


