package main.java.com.lkk.abstracts.factory;

import main.java.com.lkk.abstracts.inteface.CatInface;
import main.java.com.lkk.abstracts.inteface.DogInteface;

/**
 * @ClassName AnmialInteface
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/17:27
 * @Version 1.0
 **/
public interface AnmialInteface {

    CatInface getCatInface();

    DogInteface getDogInteface();
}
