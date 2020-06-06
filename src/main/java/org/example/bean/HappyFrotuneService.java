package org.example.bean;

public class HappyFrotuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "today is your lucky day.";
    }
}
