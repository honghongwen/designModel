package com.europa.design.abstractFactory.fact;


import com.europa.design.abstractFactory.prod.compute.Compute;
import com.europa.design.abstractFactory.prod.food.Food;
import com.europa.design.abstractFactory.prod.game.Game;

/**
 * 网吧
 * 提供一组功能，玩游戏，吃饭，给钱消费
 */
public interface InternetCafeFactory {

    /**
     * 玩游戏
     *
     * @return
     */
    Game play();

    /**
     * 吃饭
     *
     * @return
     */
    Food eat();

    /**
     * 消费
     *
     * @return
     */
    Compute consume();
}
