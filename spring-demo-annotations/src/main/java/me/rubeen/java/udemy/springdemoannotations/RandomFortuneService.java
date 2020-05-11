package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private List<String> data = Arrays.asList("Number 1", "Number 2", "Number 3");

    @Override
    public String getFortune() {
        return data.get(new Random().nextInt(data.size()));
    }
}
