package selfanswer.di;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@TypeB
@Component
@Named("diMapElem2")
public class DiElem2_1 implements DiElem {
	public String getElemParam1() {
		return "DiElem2.elemParam1";
	}

	public String getElemParam2() {
		return "DiElem2.elemParam2";
	}
}

