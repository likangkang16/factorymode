package main.java.com.lkk.abstracts.inteface.impl;

import main.java.com.lkk.abstracts.inteface.CatInface;
import main.java.com.lkk.mode.RedCat;

/**
 * @ClassName RedCatImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/17:16
 * @Version 1.0
 **/
public class RedCatImpl implements CatInface {

    public RedCatImpl(){
        System.out.println(new RedCat("抽象-小红猫",15).toString());
    }
}
