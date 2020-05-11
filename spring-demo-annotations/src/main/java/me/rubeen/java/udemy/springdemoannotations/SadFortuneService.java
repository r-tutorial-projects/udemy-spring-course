package me.rubeen.java.udemy.springdemoannotations;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Everything is black in your life.";
    }
}
