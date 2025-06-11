package AOP.aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* AOP.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllExceptReturnMagazine(){
//        System.out.println("Все, лишь бы не журнал");
//    }
//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("allReturnMethodsFromUniLibrary: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #3");
//    }

    @Before("AOP.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature =(MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+methodSignature.getName());
        System.out.println("beforeAddBookAdvice: логирование попытки получить книгу/журнал");
        System.out.println("------------------------------------");
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if(obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Информация о книге");
                    System.out.println(book.getAuthor());
                    System.out.println(book.getYearOfPublication());
                    System.out.println(book.getName());
                } else if (obj instanceof String) {
                    System.out.println("информацию в книгу добавляет:" + obj);
                }
            }
        }
    }


//    @Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
}
