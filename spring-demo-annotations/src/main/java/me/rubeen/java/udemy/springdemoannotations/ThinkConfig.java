package me.rubeen.java.udemy.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThinkConfig {
    @Bean
    public Coach thinkCoach() {
        return new ThinkCoach(thinkFortuneService());
    }

    @Bean ThinkFortuneService thinkFortuneService() {
        return new ThinkFortuneService();
    }
}
