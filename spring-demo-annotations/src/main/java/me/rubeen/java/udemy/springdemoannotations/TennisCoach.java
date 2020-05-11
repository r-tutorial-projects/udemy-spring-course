package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;

    public TennisCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    private void init() {
        System.out.println(this.getClass().getSimpleName() + " init");
    }

    @PreDestroy
    private void destroy() {
        System.out.println(this.getClass().getSimpleName() + " destroy");
    }
}
