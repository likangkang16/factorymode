package main.java.com.lkk.abstracts.inteface.impl;

import main.java.com.lkk.abstracts.inteface.CatInface;
import main.java.com.lkk.mode.YelloCat;

/**
 * @ClassName YelloCatImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/17:18
 * @Version 1.0
 **/
public class YelloCatImpl implements CatInface {

  public   YelloCatImpl(){
      System.out.println(new YelloCat("抽象-小黄猫",45));
    }
}
