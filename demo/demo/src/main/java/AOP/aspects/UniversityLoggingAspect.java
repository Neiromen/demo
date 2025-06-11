package AOP.aspects;

import AOP.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение списка студентов" +
//                "перед методом getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student student1 = students.get(0);
//        String nameSurname = student1.getNameSurname();
//        nameSurname = "Mr. "+ nameSurname;
//        student1.setNameSurname(nameSurname);
//        double averageGrage = student1.getAverageGrage();
//        averageGrage = averageGrage + 1;
//        student1.setAverageGrage(averageGrage);
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: логгируем получение списка студентов" +
//                "после работы метода getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("AfterThrowingGetStudentsLoggingAdvice: логгируем выброс исключения "+exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentLoggingAdvice() {
        System.out.println("afterGetStudentLoggingAdvice: логгируем окончание метода в любом случае");
    }
}
