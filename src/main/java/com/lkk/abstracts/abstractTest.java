package main.java.com.lkk.abstracts;

import main.java.com.lkk.abstracts.factory.impl.AnmialAImpl;
import main.java.com.lkk.abstracts.factory.impl.AnmialBImpl;

/**
 * @ClassName abstractTest 抽象工厂模式测试
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/17:32
 * @Version 1.0
 **/
public class abstractTest {
    public static void main(String[] args) {
        AnmialAImpl anmialA =new AnmialAImpl();
        anmialA.getCatInface();
        anmialA.getDogInteface();
        System.out.println("**********");
        AnmialBImpl anmialB =new AnmialBImpl();
        anmialB.getCatInface();
        anmialB.getDogInteface();
    }

}
