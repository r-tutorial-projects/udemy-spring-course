package me.rubeen.java.udemy.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        System.out.println(context.getBean("myCoach", Coach.class).getDailyWorkout());

        context.close();
    }
}
