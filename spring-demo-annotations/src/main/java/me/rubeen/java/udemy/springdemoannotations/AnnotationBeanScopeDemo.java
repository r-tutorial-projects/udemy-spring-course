package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach1 = context.getBean("tennisCoach", Coach.class);

        System.out.println();
        System.out.println(coach == coach1);
        System.out.println("coach = \t" + coach);
        System.out.println("coach1 = \t" + coach1);

        context.close();
    }
}
