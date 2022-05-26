package main.java.com.lkk.builder.combo;

import main.java.com.lkk.builder.abstracts.MealBuilder;
import main.java.com.lkk.builder.type.Combo;

/**
 * @ClassName MealA 套餐类型A
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/19/14:46
 * @Version 1.0
 **/
public  class MealA extends MealBuilder {

    @Override
    public void foodBuilder(String a) {
        Combo combo = super.getCombo();
        combo.setFood(a);
        System.out.println(combo.toString());
    }

    @Override
    public void drinkBuilder(String b) {
        Combo combo = super.getCombo();
        combo.setDrink(b);
        System.out.println(combo.toString());
    }
}
