package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestTransfer implements IAnnotationTransformer {
	
	@SuppressWarnings("rawtypes")
	public void transform(ITestAnnotation annotation,Class testcalss,Constructor testconstructer, Method method)
	{
		annotation.setRetryAnalyzer(MyRetryLogic.class);
	}

	

}
