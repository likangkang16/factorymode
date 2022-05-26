package main.java.com.lkk.builder;

import main.java.com.lkk.builder.combo.MealA;
import main.java.com.lkk.builder.combo.MealB;
import main.java.com.lkk.builder.commend.KFCCommend;
import main.java.com.lkk.builder.type.Combo;

/**
 * @ClassName BuilderTest
 * @Description //TODO
 * @Author lkk
 * Date 2022/05/19/14:56
 * @Version 1.0
 **/
public class BuilderTest {
    public static void main(String[] args) {
        KFCCommend kfcCommend =new KFCCommend();
        MealA mealA =new MealA();
        kfcCommend.setMealBuilder(mealA);
        Combo comboTypeA = kfcCommend.getComboType("水果1斤","饮料1杯");
        System.out.println(comboTypeA.getFood()+"*******"+comboTypeA.getDrink());
        MealB mealB =new MealB();
        kfcCommend.setMealBuilder(mealB);
        Combo comboTypeB = kfcCommend.getComboType("水果4斤","饮料2杯");
        System.out.println(comboTypeB.getFood()+"*******"+comboTypeB.getDrink());
    }
}
