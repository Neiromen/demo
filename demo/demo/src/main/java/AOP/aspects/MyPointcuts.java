package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* bla*(..))")
    public void allAddMethods(){}
}
