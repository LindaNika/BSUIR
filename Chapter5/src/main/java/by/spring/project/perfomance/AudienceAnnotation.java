package by.spring.project.perfomance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAnnotation {
	
	@Pointcut("execution (* by.spring.project.perfomance.Perfomer.perfome(..))")
	public void perfomance(){}
	
	@Before("perfomance()")
	public void takeSeats(){
		System.out.println("Audience took Seats.");
	}
	
	@AfterReturning("perfomance()")
	public void applaud(){
		System.out.println("Audience applouds.");
	}
	
	@Before("perfomance()")
	public void turnOffCellPhones(){
		System.out.println("Turn off Cell phones");
	}
	
	@AfterThrowing("perfomance()")
	public void moneyBack(){
		System.out.println("We ant money back.");
	}
	
	public void watchPerfomance(ProceedingJoinPoint joinPoint){
		try {
			long start = System.currentTimeMillis();
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			
			System.out.println("Took " + (end-start) + "miliseconds" );
		} catch (Throwable e) {
			moneyBack();
		}
	}

}
