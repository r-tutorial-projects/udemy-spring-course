package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService {

    List<String> fortunes = new ArrayList<>();

    public FileFortuneService() {
        //
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}
