package com.bernikov;

import java.util.Random;

public interface Actions {
    void run(int mills);

    void jump(int height);

    int getRunDistance();

    int getJumpHeight();
}
