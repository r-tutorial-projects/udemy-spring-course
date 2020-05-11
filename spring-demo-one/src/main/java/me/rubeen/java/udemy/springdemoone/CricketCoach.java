package me.rubeen.java.udemy.springdemoone;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email, team;

    public CricketCoach() {
        System.out.println("CricketCoach: Constructor");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes,";
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Setter");
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        System.out.println("Set " + team);
        this.team = team;
    }

    public void setEmail(String email) {
        System.out.println("set " + email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
