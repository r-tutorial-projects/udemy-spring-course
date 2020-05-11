package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SleepingCoach implements Coach {
    @Autowired
    @Qualifier("happyFortuneService")
    FortuneService fortuneService;

    public SleepingCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Sleep eight hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
