package me.rubeen.java.udemy.springdemoone;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new TrackCoach(new HappyFortuneService());
        System.out.println(coach.getDailyWorkout());
    }
}
