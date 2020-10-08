package com.europa.design.abstractFactory;


import com.europa.design.abstractFactory.fact.CheapCafeFactory;
import com.europa.design.abstractFactory.fact.InternetCafeFactory;

/**
 * 抽象工厂
 * 好处，基于工厂方法扩展，更倾向于一组产品的自由组合。
 */
public class Test {

    public static void main(String[] args) {
        InternetCafeFactory factory = new CheapCafeFactory();
        factory.play().forFun();
        factory.eat().fillStomach();
        factory.consume().surfingTheInternet();
    }
}
