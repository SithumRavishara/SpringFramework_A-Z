package Test2;

import Hibernate.Demo.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            int studentId = 1;

            session = factory.getCurrentSession();
            session.beginTransaction();

//            System.out.println("/nGetting Student Id "+ studentId);
//
            Student mystudent = session.get(Student.class, studentId);
//
//            session.delete(mystudent);

            System.out.println("deleting student id=2");

            session.createQuery("delete from Student where id=2").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Everything have done....!");

        }finally {
            factory.close();
        }
    }
}
