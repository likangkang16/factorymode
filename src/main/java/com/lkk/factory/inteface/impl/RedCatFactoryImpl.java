package main.java.com.lkk.factory.inteface.impl;

import main.java.com.lkk.factory.extend.RedCatFactory;
import main.java.com.lkk.factory.factory.CatFactory;
import main.java.com.lkk.factory.inteface.Factory;

/**
 * @ClassName RedCatFactoryImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:45
 * @Version 1.0
 **/
public class RedCatFactoryImpl implements Factory {
    @Override
    public CatFactory getCatFactory() {
        return new RedCatFactory();
    }
}
