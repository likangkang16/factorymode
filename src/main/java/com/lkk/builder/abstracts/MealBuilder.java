package main.java.com.lkk.builder.abstracts;

import main.java.com.lkk.builder.type.Combo;

/**
 * @ClassName MealBuilder 套餐构造器
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/19/14:37
 * @Version 1.0
 **/
public abstract class MealBuilder {

    Combo combo =new Combo();

   public abstract void foodBuilder(String a);

    public abstract void drinkBuilder(String a);

    public Combo getCombo(){
        return combo;
    }
}
