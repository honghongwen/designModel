package com.europa.design.factory;

import com.europa.design.abstractFactory.prod.game.Game;
import com.europa.design.factory.fact.GameFactory;
import com.europa.design.factory.fact.RebirthWangFactory;

/**
 * 工厂方法模式
 * 好处：与简单工厂相比较，工厂方法不需要在工厂基类上进行修改，而仅需要针对新的产品创建新的工厂类，从而去创建产品
 */
public class Test {

    public static void main(String[] args) {
        GameFactory factory = new RebirthWangFactory();
        Game game = factory.create();
        game.forFun();
    }
}
