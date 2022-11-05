package lacerda.luhan.catapi.config.aspect;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(LoggerAspectExecution)")
    private void loggableMethods() {
    }

    @Pointcut("execution(* *.*(..))")
    private void allMethod() {
    }

    @Pointcut("within(@org.springframework.web.bind.annotation.RequestMapping *)")
    private void endpointMethods() {
    }

    @Before("loggableMethods() && endpointMethods() && allMethod()")
    private void logEndpointsMethodsRequest(JoinPoint joinPoint) {
        log.info("Request realizada com os seguintes argumentos: " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "loggableMethods() && endpointMethods() && allMethod()", returning = "result")
    private void logEndpointsMethodsResponse(JoinPoint joinPoint, Object result) {
        log.info("Response retornada com os seguintes valores: " + this.getValue(result));
    }

    @Around("loggableMethods() && endpointMethods() && allMethod()")
    public Object executionTime(ProceedingJoinPoint point) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object object = point.proceed();
        long endtime = System.currentTimeMillis();

        // add execution time of your method, to make tracking your logs easier
        log.info(String.format("Request realizada em [ %s ]ms", endtime - startTime));

        return object;
    }

    private String getValue(Object result) {
        String returnValue = null;
        if (null != result) {
            if (result.toString().endsWith("@" + Integer.toHexString(result.hashCode()))) {
                returnValue = ReflectionToStringBuilder.toString(result);
            } else {
                returnValue = result.toString();
            }
        }
        return returnValue;
    }

}
