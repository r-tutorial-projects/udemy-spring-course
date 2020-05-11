package me.rubeen.java.udemy.springdemoone;

public class SwimCoach implements Coach {

    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1 hour.";
    }
}
