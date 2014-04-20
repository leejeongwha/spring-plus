package selfanswer.di;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@TypeA
@Component
@Named("diMapElem1")
public class DiElem1_1 implements DiElem {
	public String getElemParam1() {
		return "DiElem1.elemParam1";
	}

	public String getElemParam2() {
		return "DiElem1.elemParam2";
	}
}

