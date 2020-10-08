package com.europa.design.factory.fact;


import com.europa.design.abstractFactory.prod.game.Game;
import com.europa.design.abstractFactory.prod.game.RebirthWang;

public class RebirthWangFactory implements GameFactory {

    @Override
    public Game create() {
        return new RebirthWang();
    }
}
