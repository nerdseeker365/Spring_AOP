package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		//pre
		System.out.println("Entering Into "+invocation.getMethod().getName()+"with args"+Arrays.deepToString(invocation.getArguments()));
		retVal=invocation.proceed();
		//post
		System.out.println("Existing from "+invocation.getMethod().getName()+"with args"+Arrays.deepToString(invocation.getArguments()));

		return retVal;
	}

	
}
