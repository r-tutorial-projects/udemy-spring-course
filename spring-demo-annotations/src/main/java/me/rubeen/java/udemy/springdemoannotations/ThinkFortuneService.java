package me.rubeen.java.udemy.springdemoannotations;

public class ThinkFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today you have to think";
    }
}
