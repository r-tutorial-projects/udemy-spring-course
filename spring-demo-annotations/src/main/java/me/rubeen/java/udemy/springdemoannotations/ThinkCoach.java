package me.rubeen.java.udemy.springdemoannotations;

public class ThinkCoach implements Coach {
    FortuneService fortuneService;

    public ThinkCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Think as much as you can.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
