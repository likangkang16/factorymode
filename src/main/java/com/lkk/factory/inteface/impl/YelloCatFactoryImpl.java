package main.java.com.lkk.factory.inteface.impl;

import main.java.com.lkk.factory.factory.CatFactory;
import main.java.com.lkk.factory.inteface.Factory;
import main.java.com.lkk.factory.extend.YelloCatFactory;

/**
 * @ClassName YelloCatFactoryImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:44
 * @Version 1.0
 **/
public class YelloCatFactoryImpl implements Factory {
    @Override
    public CatFactory getCatFactory() {
        return new YelloCatFactory();
    }
}
