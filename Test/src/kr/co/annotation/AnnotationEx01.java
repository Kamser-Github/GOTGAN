package kr.co.annotation;

import java.lang.annotation.*;
import java.util.Arrays;
import java.util.HashMap;

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}
@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
	String yymmdd();
	String hhmmss();
}
enum TestType { FIRST, FINAL }

@Deprecated
@SuppressWarnings("111") //유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa",testDate=@DateTime(yymmdd="220101",hhmmss="235959"))
public class AnnotationEx01 {
	
	public static void main(String args[]) {
		
		Class<AnnotationEx01> cls = AnnotationEx01.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testedBy().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());
		//작성하면서 다시금 느낀것
		/*인터페이스도 객체이기이고
		 * 포함관계 인터페이스를 가져왔을때
		 * 클래스 명으로 가져오는게아니라 매서드로 가져온다.
		 */
		for(String str : anno.testTools()) {
			System.out.println("testTools="+str);
		}
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		//
		System.out.println("for Annotation");
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.class);
		System.out.println(HashMap.class);
		/*
		 * class java.util.Arrays
		   class java.util.HashMap
		 */
	}
	
}
