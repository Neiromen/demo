package hibernate_one_to_many_Uni;

import hibernate_one_to_many_Uni.entity.Department;
import hibernate_one_to_many_Uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("HR",500,1500);
//            Employee employee1 = new Employee("Oleg","Ivanov",800);
//            Employee employee2 = new Employee("Andrey","Sidorov",1000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class,2);
            session.delete(department);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
