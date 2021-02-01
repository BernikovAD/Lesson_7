package com.bernikov;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Human manVasya = new Human("Вася");
        Human manSasha = new Human("Саша");
        Human manKatya = new Human("Катя");
        Cat catKira = new Cat("Кира");
        Cat catJuly = new Cat("Джули");
        Cat catDog = new Cat("Пес");
        Robot robotR234D2 = new Robot("R234D2");
        Robot robotG4Gt5 = new Robot("G4Gt5");
        Robot robotGROT = new Robot("GROT");
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        Random rand = new Random();
        int distance = rand.nextInt(100);
        int heigth = rand.nextInt(10);
        treadmill.theadmill(manVasya,distance);
        wall.wall(manVasya,10);

    }
}
