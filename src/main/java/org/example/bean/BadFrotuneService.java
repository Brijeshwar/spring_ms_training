package org.example.bean;

public class BadFrotuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "be aware of your friends today.";
    }
}
