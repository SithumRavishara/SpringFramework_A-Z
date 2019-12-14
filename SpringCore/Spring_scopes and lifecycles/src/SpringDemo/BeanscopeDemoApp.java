package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanscopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        boolean results = (theCoach == alphaCoach);

        System.out.println("/n Poiniting to the same object" + results);

        System.out.println("/n Memory location for the Coach" + theCoach);

        System.out.println("/n Memory location for the alphaCoach" + alphaCoach);

        context.close();
    }
}
