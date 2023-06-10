package com.company;

interface EventListener{
    void update (String news);
}

public class Subscriber implements EventListener {
    private String name;

    public Subscriber(String name, EventManager group) {
        this.name = name;
        group.registerSubscriber(this);

    }

    @Override
    public void update(String news) {
        System.out.println(name + " получил оповещение: " + news);
    }
}
