package com.bernikov;

import java.util.Random;

public class Robot implements Actions {
    String name;
    int maxRun;
    int maxJump;

    public Robot(String name) {
        this.name = name;
        this.maxRun = 99999;
        this.maxJump = 0;
    }
    @Override
    public void run(int mills ) {
        System.out.printf("Робот %s пробежал на беговой дорожке %d метров\n\r", name, mills);
    }

    @Override
    public void jump(int height) {
        System.out.printf("Робот %s прыгнул через стенку высотой в %s метров\n\r", name, height);
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
