package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
    }
}