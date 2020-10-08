package com.europa.design.abstractFactory.prod.compute;

public class ExpensiveCompute implements Compute {

    @Override
    public void surfingTheInternet() {
        System.out.println("二十/小时");
    }
}
