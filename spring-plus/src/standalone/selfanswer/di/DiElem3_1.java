package selfanswer.di;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@TypeB
@Component
@Named("diMapElem3")
@Qualifier
public class DiElem3_1 implements DiElem {
	public String getElemParam1() {
		return "DiElem3.elemParam1";
	}

	public String getElemParam2() {
		return "DiElem3.elemParam2";
	}
}

