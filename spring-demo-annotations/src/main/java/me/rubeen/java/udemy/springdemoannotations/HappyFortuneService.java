package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You are awesome!";
    }
}
