package main.java.com.lkk.factory;

import main.java.com.lkk.factory.inteface.impl.RedCatFactoryImpl;
import main.java.com.lkk.factory.inteface.impl.YelloCatFactoryImpl;

/**
 * @ClassName FactoryTest
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:21
 * @Version 1.0
 **/
public class FactoryTest {
    public static void main(String[] args) {
        RedCatFactoryImpl redCatFactory =new RedCatFactoryImpl();
        redCatFactory.getCatFactory();
        YelloCatFactoryImpl yelloCatFactory =new YelloCatFactoryImpl();
        yelloCatFactory.getCatFactory();
    }
}
