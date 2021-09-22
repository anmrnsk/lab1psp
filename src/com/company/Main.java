package com.company;



public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("Intelligency - August",125000,true);
        Music m2 = new Music();
        m1.getName();
        m1.getCopies();
        m1.isPossibility();
        WriteInfo.getInstance().printInfo(m1);

    }
}

