package com.example.lingard.ipctest.FactoryMethodP;

/**
 * Created by lingard on 2019/3/1.
 */

public class Nvwa {
    public static void main(String[] args){
        AbstractFactory a = new FemaleFactory();
        FemaleBlack femaleBlack = a.createBlack();
        femaleBlack.color();
        femaleBlack.language();
        femaleBlack.setsex();
//        IHuman a1 = a.createHuman(Black.class);
//        a1.color();
//        a1.language();

    }
}
