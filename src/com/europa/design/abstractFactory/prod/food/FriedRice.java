package com.europa.design.abstractFactory.prod.food;

public class FriedRice implements Food {

    @Override
    public void fillStomach() {
        System.out.println("炒饭，有一定的营养价值，也能填饱肚子");
    }
}
