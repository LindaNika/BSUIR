package by.spring.project.perfomance;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	public void takeSeats(){
		System.out.println("Audience took Seats.");
	}
	
	public void applaud(){
		System.out.println("Audience applouds.");
	}
	
	public void turnOffCellPhones(){
		System.out.println("Turn off Cell phones");
	}
	
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
