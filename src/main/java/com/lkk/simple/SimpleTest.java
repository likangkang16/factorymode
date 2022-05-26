package main.java.com.lkk.simple;


import main.java.com.lkk.simple.factory.CatFactory;

/**
 * @ClassName SimpleTest 简单工厂模式测试
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/18/15:21
 * @Version 1.0
 **/
public class SimpleTest {
    public static void main(String[] args) {
        Factory factroy =new Factory();
        CatFactory red = factroy.getCatFactory("red");
        CatFactory yello = factroy.getCatFactory("yello");
    }
}
