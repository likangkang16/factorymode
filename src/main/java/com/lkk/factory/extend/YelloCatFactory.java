package main.java.com.lkk.factory.extend;

import main.java.com.lkk.factory.factory.CatFactory;
import main.java.com.lkk.mode.YelloCat;

/**
 * @ClassName CatImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:06
 * @Version 1.0
 **/
public class YelloCatFactory extends CatFactory {
    public YelloCatFactory() {
        System.out.println(new YelloCat("小黄",12).toString());
    }
}
