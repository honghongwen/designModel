package com.europa.design.simpleFacotry;

public class GameFactory {

    public static Game create(String name) {
        switch (name) {
            case "YuanShen" :
                return new YuanShen();
            case "RebirthWang":
                return new RebirthWang();
            case "LOL":
                return new LeagueOfLegends();
        }
        throw new IllegalArgumentException("NOT FOUND GAME YOU WANTED");
    }
}
