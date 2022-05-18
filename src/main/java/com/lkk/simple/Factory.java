package main.java.com.lkk.simple;

import main.java.com.lkk.simple.factory.CatFactory;
import main.java.com.lkk.simple.extend.RedCatFactory;
import main.java.com.lkk.simple.extend.YelloCatFactory;

/**
 * @ClassName Factroy
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:22
 * @Version 1.0
 **/
public class Factory {

    public CatFactory getCatFactory(String type) {
        switch (type) {
            case "red":
                return new RedCatFactory();
            case "yello":
                return new YelloCatFactory();
            default:
                break;
        }
        ;
        return null;
    }
}
