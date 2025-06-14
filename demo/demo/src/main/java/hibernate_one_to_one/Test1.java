package hibernate_one_to_one;

import hibernate_one_to_one.Entity.Detail;
import hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Alexandr","Korobko","IT",700);
//            Detail detail = new Detail("Baku","1234567890","lox.chilisky@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg","Smirnov","Sales",700);
//            Detail detail = new Detail("Moscow","9876543210","lox.indisky@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session.beginTransaction();

            Employee emp = session.get(Employee.class,2);
            session.delete(emp);
            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
