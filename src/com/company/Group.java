package com.company;

import java.util.ArrayList;
import java.util.List;

interface EventManager {
    void registerSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscriber(String newNews);
}

public class Group implements EventManager {

    private List<Subscriber> subscribers;
    private String newsGroup;

    public Group() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String newNews) {
        newsGroup = newNews;
        for (EventListener i :
                subscribers) {
            i.update(newsGroup);
        }
    }
}
