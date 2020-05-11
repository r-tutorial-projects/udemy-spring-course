package me.rubeen.java.udemy.springdemoone;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public void init() {
        System.out.println("TrackCoach: INIT");
    }

    public void destroy() {
        System.out.println("TrackCoach: DESTROY");
    }
}
