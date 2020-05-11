package me.rubeen.java.udemy.springdemoone;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes;
    private Random random = new Random();

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }

    public void setFortunes(String fortunes) {
        this.fortunes = fortunes.split(";");
    }
}
