package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
    }
}
