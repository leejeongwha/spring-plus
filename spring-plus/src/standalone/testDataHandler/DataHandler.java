package testDataHandler;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class DataHandler {
	private Map<String, String> data;

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
	public String get(String key) {
		Set<String> keys = data.keySet();
        for (String targetKey : keys) {
            if (StringUtils.equals(targetKey, key)) {
                return data.get(targetKey);
            }
        }
        return "";
	}
}
