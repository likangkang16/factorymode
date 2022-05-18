package main.java.com.lkk.factory.inteface;

import main.java.com.lkk.factory.factory.CatFactory;
import main.java.com.lkk.factory.extend.RedCatFactory;
import main.java.com.lkk.factory.extend.YelloCatFactory;

/**
 * @ClassName Factroy
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:22
 * @Version 1.0
 **/
public interface Factory {

    CatFactory getCatFactory();
}
