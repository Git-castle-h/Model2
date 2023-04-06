package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = Pointcut + Advice
public class LogAdvice {
	@Before("com.springbook.biz.common.PointcutCommon.allPointcut()")
	public void printLog(){
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}
