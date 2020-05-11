package me.rubeen.java.udemy.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //retrieve bean from container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("myCoach", Coach.class);

        System.out.println();
        System.out.println(coach == coach1);
        System.out.println("Memory location Coach: \t" + coach);
        System.out.println("Memory location Coach1: \t" + coach1);
    }
}
