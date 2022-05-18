package main.java.com.lkk.simple.extend;

import main.java.com.lkk.simple.factory.CatFactory;
import main.java.com.lkk.mode.RedCat;

/**
 * @ClassName RedCatFactory
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:19
 * @Version 1.0
 **/
public class RedCatFactory extends CatFactory {
    public RedCatFactory() {
        System.out.println(new RedCat("小红",15).toString());
    }
}
