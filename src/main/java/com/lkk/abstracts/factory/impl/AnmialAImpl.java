package main.java.com.lkk.abstracts.factory.impl;

import main.java.com.lkk.abstracts.factory.AnmialInteface;
import main.java.com.lkk.abstracts.inteface.CatInface;
import main.java.com.lkk.abstracts.inteface.DogInteface;
import main.java.com.lkk.abstracts.inteface.impl.RedDogImpl;
import main.java.com.lkk.abstracts.inteface.impl.YelloCatImpl;

/**
 * @ClassName AnmialImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/17:29
 * @Version 1.0
 **/
public class AnmialAImpl implements AnmialInteface {
    @Override
    public CatInface getCatInface() {
        return new YelloCatImpl();
    }

    @Override
    public DogInteface getDogInteface() {
        return new RedDogImpl();
    }
}
