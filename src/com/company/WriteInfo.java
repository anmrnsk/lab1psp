package com.company;

public class WriteInfo {

private static WriteInfo instance;

public static WriteInfo getInstance (){
    if (instance == null) {
        instance = new WriteInfo();
    }
    return instance;
}

    public void printInfo(Music music){
        System.out.println("-----------------------------");
        music.getName();
        music.getClass();
        music.isPossibility();
        System.out.println("-----------------------------");
    }

}
