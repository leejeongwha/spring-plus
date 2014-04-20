package aop;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Pointcut;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

import com.nhncorp.edu.plus.aop1.bo.AopAspect1;
import com.nhncorp.edu.plus.aop1.bo.AopBO1;

public class AopCase {
	@Test
	public void testCase1() throws Exception {
		Pointcut pointCut = null;
		
		Method[] mothods = AopAspect1.class.getMethods();
		
		for (Method method : mothods) {
			Pointcut pt = method.getAnnotation(Pointcut.class);
			
			if (pt != null) {
				pointCut = pt;
			}
		}
		
		AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
		pointcut.setExpression(pointCut.value());
		
		Assert.assertThat(pointcut.getMethodMatcher().matches(AopBO1.class.getMethod("getString"), null), CoreMatchers.is(true));
	}
}

