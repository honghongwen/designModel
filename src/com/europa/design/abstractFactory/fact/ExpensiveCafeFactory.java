package com.europa.design.abstractFactory.fact;

import com.europa.design.abstractFactory.prod.compute.Compute;
import com.europa.design.abstractFactory.prod.compute.ExpensiveCompute;
import com.europa.design.abstractFactory.prod.food.Food;
import com.europa.design.abstractFactory.prod.food.FriedRice;
import com.europa.design.abstractFactory.prod.game.Game;
import com.europa.design.abstractFactory.prod.game.LeagueOfLegends;

/**
 * 贵的网吧套餐
 */
public class ExpensiveCafeFactory implements InternetCafeFactory {

    @Override
    public Game play() {
        return new LeagueOfLegends();
    }

    @Override
    public Food eat() {
        return new FriedRice();
    }

    @Override
    public Compute consume() {
        return new ExpensiveCompute();
    }
}
