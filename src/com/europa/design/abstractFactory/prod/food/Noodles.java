package com.europa.design.abstractFactory.prod.food;

public class Noodles implements Food {

    @Override
    public void fillStomach() {
        System.out.println("泡面，吃多了对身体不好");
    }
}
