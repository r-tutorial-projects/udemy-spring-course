package me.rubeen.java.udemy.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        //load config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean
        Coach coach = context.getBean("myCoach", Coach.class);
        //call methods on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        //close context
        context.close();
    }
}
