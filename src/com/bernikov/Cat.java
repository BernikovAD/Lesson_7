package com.bernikov;

import java.util.Random;

public class Cat implements Actions {
    String name;
    int maxRun;
    int maxJump;

    public Cat(String name) {
        this.name = name;
        this.maxRun = 1500;
        this.maxJump = 5;
    }
    @Override
    public void run(int mills ) {
        System.out.printf("Кот %s пробежал на беговой дорожке %d метров\n\r", name, mills);
    }

    @Override
    public void jump(int height) {
        System.out.printf("Кот %s прыгнул через стенку высотой в %s метров\n\r", name, height);
    }

    @Override
    public int getRunDistance() {
        return 0;
    }

    @Override
    public int getJumpHeight() {
        return 0;
    }
}
