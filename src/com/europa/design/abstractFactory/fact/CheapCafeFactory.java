package com.europa.design.abstractFactory.fact;


import com.europa.design.abstractFactory.prod.compute.CheapCompute;
import com.europa.design.abstractFactory.prod.compute.Compute;
import com.europa.design.abstractFactory.prod.food.Food;
import com.europa.design.abstractFactory.prod.food.Noodles;
import com.europa.design.abstractFactory.prod.game.Game;
import com.europa.design.abstractFactory.prod.game.LeagueOfLegends;

/**
 * 便宜的网吧套餐
 */
public class CheapCafeFactory implements InternetCafeFactory {

    @Override
    public Game play() {
        return new LeagueOfLegends();
    }

    @Override
    public Food eat() {
        return new Noodles();
    }

    @Override
    public Compute consume() {
        return new CheapCompute();
    }
}
