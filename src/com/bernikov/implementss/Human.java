package com.bernikov.implementss;

public class Human implements Actions {
    String name;
    public int maxRun;
    int countRun;
    public int maxJump;
    boolean champion;

    public Human(String name) {
        this.name = name;
        this.maxRun = 5000;
        this.maxJump = 2;
        this.countRun = 0;
        this.champion = true;
    }

    @Override
    public void run(int mills) {
        if (champion) {
            if (mills > (maxRun - countRun)) {
                System.out.printf("Человек %s не смог пробежать на беговой дорожке %d метров, ему не хватило выносливости!\n\r", name, mills);
                champion = false;
            } else {
                System.out.printf("Человек %s пробежал на беговой дорожке %d метров\n\r", name, mills);
                countRun += mills;
            }
        }
        //else System.out.printf("Человек %s НЕ СМОГ ПРОБЕЖАТЬ МАРАФОН!\n\r", name);
    }

    @Override
    public void jump(int height) {
        if (champion) {
            if (height > maxJump) {
                System.out.printf("Человек %s не смог прыгнуть через стенку высотой в %s метров, он не умеет так высоко прыгать!\n\r", name, height);
                champion = false;
            } else {
                System.out.printf("Человек %s прыгнул через стенку высотой в %s метров\n\r", name, height);
            }
        }
        //else System.out.printf("Человек %s НЕ СМОГ ПРОБЕЖАТЬ МАРАФОН!\n\r", name);
    }

}
