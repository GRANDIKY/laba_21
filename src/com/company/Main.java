package com.company;

public class Main {

    public static void main(String[] args) {
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group group4 = new Group();

        Subscriber artem = new Subscriber("Artem", group1);
        group2.registerSubscriber(artem);
        group3.registerSubscriber(artem);

        Subscriber masha = new Subscriber("Masha", group4);
        group2.registerSubscriber(masha);
        group3.registerSubscriber(masha);

        group1.notifySubscriber("Вышла новая запись о продуктах");
        group2.notifySubscriber("Вышла новая запись о спорте");
        group3.notifySubscriber("Вышла новая запись о кошках");
        group4.notifySubscriber("Вышла новая запись о одежде");

    }
}

