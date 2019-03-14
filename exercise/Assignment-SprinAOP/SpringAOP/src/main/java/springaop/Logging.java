package springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Aspect
public class Logging {

    @Before("execution(public void display())")
    void beforeLogging() {
        System.out.println("\nBefore logging");
    }

    @After("execution(public void display())")
    void afterLogging(){
        System.out.println("\nAfter logging");
    }

    @Before("within(Services)")
    void beforeServices(){
        System.out.println("\nPoint cut before services...");
    }

    @Around("execution(public void service4())")
    void aroundServices(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("\nPoint cut around services");
        System.out.println("before proceeding joint point");
        proceedingJoinPoint.proceed();
        System.out.println("after proceeding joint point");
    }

    @AfterThrowing(pointcut = "execution(* springaop.Services.*())", throwing = "ex")
    void afterThrowing(IOException ex){
        System.out.println("\nafter throwing IOException");
    }

    @Before("args(Integer)")
    void beforeArgs(){
        System.out.println("\nRunning before args advice");
    }

    @Before("this(springaop.Services)")
    void beforeThis(){
        System.out.println("\nRunnnig before 'this' advice");
    }

    @Before("bean(services)")
    void beforeBean(){
        System.out.println("\nRunning before bean");
    }

//    @After()
    void afterPointCut(){
        System.out.println("Running after ");
    }
}