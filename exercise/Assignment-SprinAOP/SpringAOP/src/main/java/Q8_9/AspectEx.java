package Q8_9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectEx {

    @After("displayPointcut() || getStringPointcut()")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

    @Pointcut("execution(void display())")
    void displayPointcut(){}

    @Pointcut("execution(String getString())")
    void getStringPointcut(){}

    @Before("execution(void displayFunctionDetails())")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice printing function");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}
