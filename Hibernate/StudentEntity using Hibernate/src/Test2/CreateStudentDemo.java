package Test2;

import Hibernate.Demo.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            System.out.println("Creating New Student Object....!");
            Student tempStudent = new Student("paul","Wall","Sithum@gmail.com");

            session.beginTransaction();

            System.out.println("Saving student");
            session.save(tempStudent);

            session.getTransaction().commit();

            System.out.println("Everything have done....!");

        }finally {
            factory.close();
        }
    }
}
