package ua.goit.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component("myLogging")
public class MyLogging {

    public Object logging(ProceedingJoinPoint joinPoint) {
        Object output = null;
        System.out.println("Method begin " + joinPoint.getSignature().toShortString());
        try {
            output = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("log");

        return output;
    }

    public void print(Object obj) {
        if (obj instanceof Set) {
            for (String fileName : (Set<String>)obj) {
                System.out.println(fileName);
            }
        }
    }
}
