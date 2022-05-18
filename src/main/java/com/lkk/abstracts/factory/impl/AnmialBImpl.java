package main.java.com.lkk.abstracts.factory.impl;

import main.java.com.lkk.abstracts.factory.AnmialInteface;
import main.java.com.lkk.abstracts.inteface.CatInface;
import main.java.com.lkk.abstracts.inteface.DogInteface;
import main.java.com.lkk.abstracts.inteface.impl.RedCatImpl;
import main.java.com.lkk.abstracts.inteface.impl.YelloDogImpl;

/**
 * @ClassName AnmialBImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/17:31
 * @Version 1.0
 **/
public class AnmialBImpl implements AnmialInteface {
    @Override
    public CatInface getCatInface() {
        return new RedCatImpl();
    }

    @Override
    public DogInteface getDogInteface() {
        return new YelloDogImpl();
    }
}
