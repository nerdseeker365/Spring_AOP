package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice1 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		Object args[]=null;
		System.out.println("Entering Into "+invocation.getMethod().getName()+"with args"+Arrays.deepToString(invocation.getArguments()));
		retVal=invocation.proceed();
		args=invocation.getArguments();
		if(((Float)args[0])<50000)
			args[1]=((Float)args[1])-0.5f;
		System.out.println("Existing from "+invocation.getMethod().getName()+"with args"+Arrays.deepToString(invocation.getArguments()));

		return retVal;
	}

	
}
