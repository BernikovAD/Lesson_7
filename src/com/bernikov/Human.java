package com.bernikov;

import java.util.Random;

public class Human implements Actions {
    String name;
    int maxRun;
    int maxJump;

    public Human(String name) {
        this.name = name;
        this.maxRun = 5000;
        this.maxJump = 2;
    }

    @Override
    public void run(int mills ) {
        System.out.printf("Человек %s пробежал на беговой дорожке %d метров\n\r", name, mills);
    }

    @Override
    public void jump(int height) {
        System.out.printf("Человек %s прыгнул через стенку высотой в %s метров\n\r", name, height);
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
