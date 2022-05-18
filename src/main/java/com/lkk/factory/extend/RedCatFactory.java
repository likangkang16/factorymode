package main.java.com.lkk.factory.extend;

import main.java.com.lkk.factory.factory.CatFactory;
import main.java.com.lkk.mode.RedCat;

import java.net.PortUnreachableException;

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

    public void getHolle(){
        System.out.println("holle word");
    }
}
