package com.bernikov.implementss;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Actions[] runners = {
                new Human("Вася"),
                new Human("Саша"),
                new Human("Катя"),
                new Cat("Кира"),
                new Cat("Джули"),
                new Cat("Пес"),
                new Robot("R234D2"),
                new Robot("G4Gt5"),
                new Robot("GROT")
        };
        Random rand = new Random();
        int distance = rand.nextInt(10000);
        int heigth = rand.nextInt(10);
        for (int i = 0; i < runners.length; i++) {
            if(runners[i] instanceof Human) {
                ((Human) runners[i]).maxRun = distance;
                ((Human) runners[i]).maxJump = heigth;
            }
            else if(runners[i] instanceof Cat) {
                    ((Cat) runners[i]).maxRun = distance;
                    ((Cat) runners[i]).maxJump = heigth;
                }
            else if(runners[i] instanceof Robot) {
                ((Robot) runners[i]).maxRun = 9999999;
                ((Robot) runners[i]).maxJump = heigth;
            }
            distance = rand.nextInt(10000);
            heigth = rand.nextInt(10);
        }
        Object[] objects = new Object[6];
        for (int i = 0; i < objects.length; i++) {
            if (i % 2 == 0) objects[i] = new Treadmill(distance);
            else objects[i] = new Wall(heigth);
            distance = rand.nextInt(10000);
            heigth = rand.nextInt(10);
        }

        for (int i = 0; i < runners.length; i++) {
            for (int j = 0; j < objects.length; j++) {
                if(objects[j] instanceof Treadmill){
                    ((Treadmill) objects[j]).theadmill(runners[i]);
                }
                else ((Wall) objects[j]).wall(runners[i]);
            }

        }

    }
}
