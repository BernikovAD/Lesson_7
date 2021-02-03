package com.bernikov.implementss;

public class Wall {
    int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    void wall(Actions actions){
        actions.jump(heigth);
    }
}
