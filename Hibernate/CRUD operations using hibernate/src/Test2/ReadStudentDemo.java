package Test2;

import Hibernate.Demo.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            System.out.println("Creating New Student Object....!");
            Student tempStudent = new Student("Daffy","Duck","Daffy@gmail.com");

            session.beginTransaction();

            System.out.println("Saving student");
            System.out.println(tempStudent);
            session.save(tempStudent);

            session.getTransaction().commit();

            System.out.println("Id"+ tempStudent.getId());


            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("/nGetting Student Id "+ tempStudent.getId());
            Student mystudent = session.get(Student.class, tempStudent.getId());

            System.out.println("Student:"+ mystudent);

            session.getTransaction().commit();
            System.out.println("Everything have done....!");

        }finally {
            factory.close();
        }
    }
}
