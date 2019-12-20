package Test2;

import Hibernate.Demo.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            int studentId = 2;

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("/nGetting Student Id "+ studentId);
            Student mystudent = session.get(Student.class, studentId);

            System.out.println("Updating students");
            mystudent.setFirstname("Scooby");

            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("UPDATE Student set email='foo@gmail.com'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Everything have done....!");

        }finally {
            factory.close();
        }
    }
}
