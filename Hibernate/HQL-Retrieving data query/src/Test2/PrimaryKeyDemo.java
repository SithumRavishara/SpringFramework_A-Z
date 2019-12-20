package Test2;

import Hibernate.Demo.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            System.out.println("Creating New 3 Students Object....!");
            Student tempStudent1 = new Student("Massy","Micky","lazzy@gmail.com");
            Student tempStudent2 = new Student("Shaun","saew","Shawn@gmail.com");
            Student tempStudent3 = new Student("Dourt","wall","dourt@gmail.com");

            session.beginTransaction();

            System.out.println("Saving students");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            session.getTransaction().commit();

            System.out.println("Everything have done....!");

        }finally {
            factory.close();
        }
    }
}
